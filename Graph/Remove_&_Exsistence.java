import java.util.*;

class DirectedGraph<T> {
    // Adjacency list: Maps each vertex to a list of its neighbors
    private Map<T, List<T>> adjList;

    // Constructor
    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(T vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add a directed edge from source to destination
    public void addEdge(T source, T destination) {
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(destination);
    }

    // Remove a vertex and its associated edges
    public void removeVertex(T vertex) {
        // Remove the vertex and its neighbor list
        adjList.remove(vertex);
        // Remove all incoming edges to this vertex
        for (List<T> neighbors : adjList.values()) {
            neighbors.remove(vertex);
        }
    }

    // Remove a directed edge from source to destination
    public void removeEdge(T source, T destination) {
        List<T> neighbors = adjList.get(source);
        if (neighbors != null) {
            neighbors.remove(destination);
        }
    }

    // Check if a directed edge exists from source to destination
    public boolean hasEdge(T source, T destination) {
        List<T> neighbors = adjList.get(source);
        return neighbors != null && neighbors.contains(destination);
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

    // Main method to test the new functionalities
    public static void main(String[] args) {
        DirectedGraph<String> graph = new DirectedGraph<>();
        // Add directed edges
        graph.addEdge("A", "B"); // A -> B
        graph.addEdge("A", "C"); // A -> C
        graph.addEdge("B", "D"); // B -> D
        graph.addEdge("C", "D"); // C -> D
        graph.addEdge("D", "A"); // D -> A

        System.out.println("Original Graph:");
        graph.printGraph();

        // Test edge existence
        System.out.println("\nDoes edge A -> B exist? " + graph.hasEdge("A", "B"));
        System.out.println("Does edge B -> A exist? " + graph.hasEdge("B", "A"));

        // Remove edge A -> B
        graph.removeEdge("A", "B");
        System.out.println("\nAfter removing edge A -> B:");
        graph.printGraph();

        // Remove vertex C
        graph.removeVertex("C");
        System.out.println("\nAfter removing vertex C:");
        graph.printGraph();
    }
}
