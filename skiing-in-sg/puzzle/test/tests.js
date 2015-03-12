//for a matrix a[[0 0 1] [1 0 1]]
//a[row][col]=a[x][y]
var expect = require('chai').expect;
var map = [[4, 8, 7, 3],
           [2, 5, 9, 3],
           [6, 3, 2, 5],
           [4, 4, 1, 6]];

describe('The solution module', function() {
  var solutionModule = require('../src/solution');
  it('takes a starting point and returns {path, length}', function() {
    solutionModule.init(map);
    var startingPoint = {row: 0, col: 1};
    var bestPath = solutionModule.getBestPath(startingPoint);
    expect(bestPath).to.have.property("path");
    expect(bestPath).to.have.property("length");
    expect(bestPath.length).to.equal(5);
    expect(bestPath.path).to.deep.equal([1,2,3,5,8]);
  });
  it('returns best {path, length} from the map it was init with', function() {
    solutionModule.init(map);
    var bestPath = solutionModule.getBestPath();
    console.log(bestPath);
    expect(bestPath).to.have.property("path");
    expect(bestPath).to.have.property("length");
    expect(bestPath.length).to.equal(5);
    expect(bestPath.path).to.deep.equal([1,2,3,5,9]);
  });
});
