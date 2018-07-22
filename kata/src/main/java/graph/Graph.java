package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represent graph as Adj list
 */
public class Graph {
    Node [] nodes;

    public Graph(int numNodes) {
        this.nodes =  new Node[numNodes];
    }
    public void addEdge(int fromNode, int toNode) {
        if (this.nodes[fromNode] == null) this.nodes[fromNode] = new Node(fromNode);
        if (this.nodes[toNode] == null) this.nodes[toNode] = new Node(toNode);
        this.nodes[fromNode].addEdge(this.nodes[toNode]);
    }
    public List<String> getRepr() {
        return Arrays.stream(this.nodes).map(Node::getRepr).collect(Collectors.toList());
    }
}

class Node {
    int number;
    List<Edge> edges;

    public Node(int number) {
        this.number = number;
        this.edges = new ArrayList<>();
    }
    public void addEdge(Node toNode) {
        this.edges.add(new Edge(this, toNode));
    }
    public String getRepr() {
        return this.edges.size() > 0
            ? this.edges.stream().map(Edge::toString).collect(Collectors.joining())
            : "";
    }
}

class Edge {
    Node fromNode;
    Node toNode;

    public Edge(Node fromNode, Node toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }
    public String toString() {
        return String.format("%d -> %d", fromNode.number, toNode.number);
    }
}
