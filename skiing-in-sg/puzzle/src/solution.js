var util = require('util');
var map;
var visited = [[]];
var module = module.exports;

var NULLPATH = {length: 0, path: []};
NULLPATH.clone = function() {
  return {length: this.length, path: this.path.slice(), clone: this.clone};
}

module.init = function(initmap) {
  map = initmap;
}

module.getBestPath = function(startingPoint) {
  if (startingPoint) {
    return usePoint(startingPoint);
  }
  else {
    fromMap();
    var longestRows = [];
    for (var row = 0; row < visited.length; row++) {
      longestRows.push(getLargestElement(visited[row]));
    }
    return getLargestElement(longestRows).path;
  }
}

//private function
var getLargestElement = function(array) {
  var largest = {path: NULLPATH.clone()};
  for (var col = 0; col < array.length; col++) {
    if(largest.path.length < array[col].path.length) {
      largest = array[col];
    } else if(largest.path.length === array[col].path.length) {
      var oldDiff = largest.path.path[largest.path.length - 1] - largest.path.path[0];
      var newDiff = array[col].path.path[array[col].path.length - 1]
        - array[col].path.path[0];
      if (newDiff > oldDiff) largest = array[col];
    }
  }
  return largest;
}

var fromMap = function() {
  for (var row = 0; row < map.length; row++) {
    for (var col = 0; col < map[row].length; col++) {
      usePoint({row: row, col: col});
    }
  }
}

var usePoint = function(point) {
  //if the row has not been init, assign a new array at that row
  !visited[point.row] && (visited[point.row] = []);
  if (visited[point.row][point.col] &&
      visited[point.row][point.col]['visit'] === 1) {
    return visited[point.row][point.col]['path'].clone();
  }

  var currentElevation = map[point.row][point.col];
  visited[point.row][point.col] = {"visit": 1, "path": NULLPATH.clone(),
    "elevation": currentElevation, "point": point};

  var nPath = go(point, {row: point.row - 1, col: point.col}); //Go North
  var wPath = go(point, {row: point.row, col: point.col - 1}); //Go West
  var sPath = go(point, {row: point.row + 1, col: point.col}); //Go South
  var ePath = go(point, {row: point.row, col: point.col + 1});  //Go East

  var longestPath = getLongestPath(nPath, ePath);
  longestPath = getLongestPath(longestPath, sPath);
  longestPath = getLongestPath(longestPath, wPath);
  longestPath.length = longestPath.length + 1;
  longestPath.path[longestPath.path.length] = currentElevation;
  visited[point.row][point.col]["path"]= longestPath;
  return longestPath;
}

var go = function(fromPoint, toPoint) {
  if(!inMap(toPoint)) return NULLPATH.clone();

  var elevation = map[toPoint.row][toPoint.col];
  var currentElevation = map[fromPoint.row][fromPoint.col];
  if (elevation >= currentElevation) return NULLPATH.clone();
  return usePoint({row: toPoint.row, col: toPoint.col});
}

var inMap = function(point) {
  return 0 <= point.row && point.row < map.length &&
    0 <= point.col && point.col < map[0].length;
}

var getLongestPath = function(path1, path2) {
  if (path1.length > path2.length) return path1.clone();
  if (path1.length < path2.length) return path2.clone();
  var path1Diff = path1[0] - path1[path1.length - 1];
  var path2Diff = path2[0] - path2[path2.length - 1];
  if (path1Diff > path2Diff) return path1.clone();
  return path2.clone();
}

var print = function(path) {
  console.log(path);
}
