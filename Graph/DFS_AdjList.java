import java.util.*;

class DirectedGraph<T> {
    private Map<T, List<T>> adjList;

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    public void addVertex(T vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(T source, T destination) {
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(destination);
    }

    public void removeVertex(T vertex) {
        adjList.remove(vertex);
        for (List<T> neighbors : adjList.values()) {
            neighbors.remove(vertex);
        }
    }

    public void removeEdge(T source, T destination) {
        List<T> neighbors = adjList.get(source);
        if (neighbors != null) {
            neighbors.remove(destination);
        }
    }

    public boolean hasEdge(T source, T destination) {
        List<T> neighbors = adjList.get(source);
        return neighbors != null && neighbors.contains(destination);
    }

    public List<T> getNeighbors(T vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    public void printGraph() {
        for (T vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    // Depth-First Search starting from a given vertex
    public void dfs(T start) {
        Set<T> visited = new HashSet<>();
        dfsUtil(start, visited);
    }

    // Helper method for recursive DFS
    private void dfsUtil(T vertex, Set<T> visited) {
        // Mark the current vertex as visited and print it
        visited.add(vertex);
        System.out.print(vertex + " ");

        // Visit all unvisited neighbors
        for (T neighbor : getNeighbors(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS for the entire graph (handles disconnected components)
    public void dfsAll() {
        Set<T> visited = new HashSet<>();
        for (T vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                dfsUtil(vertex, visited);
            }
        }
        System.out.println(); // Newline after traversal
    }

    public static void main(String[] args) {
        DirectedGraph<String> graph = new DirectedGraph<>();
        // Add edges
        graph.addEdge("A", "B"); // A -> B
        graph.addEdge("A", "C"); // A -> C
        graph.addEdge("B", "D"); // B -> D
        graph.addEdge("C", "D"); // C -> D
        graph.addEdge("D", "A"); // D -> A (creates a cycle)
        graph.addEdge("E", "F"); // E -> F (disconnected component)

        System.out.println("Graph:");
        graph.printGraph();

        System.out.println("\nDFS starting from A:");
        graph.dfs("A");

        System.out.println("\nDFS for entire graph:");
        graph.dfsAll();
    }
}
