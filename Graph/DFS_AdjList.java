import java.util.*;

// Graph class using HashMap for adjacency list
class GraphHashMap {
    // Adjacency list: Maps vertex to list of neighbors
    private Map<Integer, List<Integer>> adjList;
    // Store DFS traversal order
    private List<Integer> dfsOrder;

    // Constructor: Initialize for N vertices
    GraphHashMap(int vertices) {
        adjList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>()); // Pre-add vertices 0 to N-1
        }
        dfsOrder = new ArrayList<>();
    }

    // Add undirected edge: u ↔ v
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // DFS traversal starting from vertex 0
    void dfs() {
        Set<Integer> visited = new HashSet<>();
        dfsOrder.clear();
        dfsUtil(0, visited);
    }

    // Recursive DFS helper
    private void dfsUtil(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        dfsOrder.add(vertex); // Add to traversal order
        for (int neighbor : adjList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Get DFS order for printing
    List<Integer> getDFSOrder() {
        return dfsOrder;
    }
}

// Graph class using array of Lists for adjacency list
class GraphList {
    // Adjacency list: Array where adjList[i] is neighbors of vertex i
    private List<Integer>[] adjList;
    // Store DFS traversal order
    private List<Integer> dfsOrder;

    // Constructor: Initialize for N vertices
    @SuppressWarnings("unchecked")
    GraphList(int vertices) {
        adjList = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
        dfsOrder = new ArrayList<>();
    }

    // Add undirected edge: u ↔ v
    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    // DFS traversal starting from vertex 0
    void dfs() {
        boolean[] visited = new boolean[adjList.length];
        dfsOrder.clear();
        dfsUtil(0, visited);
    }

    // Recursive DFS helper
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        dfsOrder.add(vertex); // Add to traversal order
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Get DFS order for printing
    List<Integer> getDFSOrder() {
        return dfsOrder;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read vertices and edges
        int N = scanner.nextInt(); // Number of vertices
        int E = scanner.nextInt(); // Number of edges

        // Create graphs
        GraphHashMap graphHashMap = new GraphHashMap(N);
        GraphList graphList = new GraphList(N);

        // Read and add edges
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graphHashMap.addEdge(u, v);
            graphList.addEdge(u, v); // Same edges for both
        }

        // Perform DFS on both graphs
        graphHashMap.dfs();
        graphList.dfs();

        // Print DFS order (same for both, as graph structure is identical)
        System.out.println("DFS Order (HashMap):");
        List<Integer> orderHashMap = graphHashMap.getDFSOrder();
        for (int i = 0; i < orderHashMap.size(); i++) {
            System.out.print(orderHashMap.get(i));
            if (i < orderHashMap.size() - 1) System.out.print(" ");
        }
        System.out.println();

        System.out.println("DFS Order (List):");
        List<Integer> orderList = graphList.getDFSOrder();
        for (int i = 0; i < orderList.size(); i++) {
            System.out.print(orderList.get(i));
            if (i < orderList.size() - 1) System.out.print(" ");
        }
        System.out.println();

        scanner.close();
    }
}
