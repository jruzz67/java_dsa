import java.util.*;

class Graph<T> {
    // Adjacency list: Maps each vertex to a list of its neighbors
    private Map<T, List<T>> adjList;

    // Constructor
    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(T vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an undirected edge between source and destination
    public void addEdge(T source, T destination) {
        // Ensure both vertices exist
        addVertex(source);
        addVertex(destination);
        // Add edge from source to destination
        adjList.get(source).add(destination);
        // Add edge from destination to source (undirected)
        adjList.get(destination).add(source);
    }

    // Get neighbors of a vertex
    public List<T> getNeighbors(T vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    // Print the graph
    public void printGraph() {
        for (T vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        // Add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        // Print the graph
        graph.printGraph();
        // Get neighbors of a vertex
        System.out.println("Neighbors of A: " + graph.getNeighbors("A"));
    }
}
