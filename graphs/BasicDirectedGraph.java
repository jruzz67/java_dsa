import java.util.*;

public class BasicDirectedGraph<T> {
    // Adjacency list: Maps each vertex to a list of its neighbors
    private Map<T, List<T>> adjList;

    // Constructor
    public BasicDirectedGraph() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(T vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add a directed edge from source to destination
    public void addEdge(T source, T destination) {
        // Ensure both vertices exist
        addVertex(source);
        addVertex(destination);
        // Add edge from source to destination only
        adjList.get(source).add(destination);
    }

    // Get neighbors of a vertex (outgoing edges)
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
        BasicDirectedGraph<String> graph = new BasicDirectedGraph<>();
        // Add directed edges
        graph.addEdge("A", "B"); // A -> B
        graph.addEdge("A", "C"); // A -> C
        graph.addEdge("B", "D"); // B -> D
        graph.addEdge("C", "D"); // C -> D
        graph.addEdge("D", "A"); // D -> A (creates a cycle)
        // Print the graph
        graph.printGraph();
        // Get neighbors of a vertex
        System.out.println("Neighbors of A: " + graph.getNeighbors("A"));
        System.out.println("Neighbors of B: " + graph.getNeighbors("B"));
    }
}

/*
 * Testcase:
 * Input: None (hardcoded)
 * Output: 
 * A -> [B, C]
 * B -> [D]
 * C -> [D]
 * D -> [A]
 * Neighbors of A: [B, C]
 * Neighbors of B: [D]
 */
