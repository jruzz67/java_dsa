import java.util.*;

public class Main {

    static void bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");
            for (int nei : adj.get(curr)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfs(i, adj, visited);
            }
        }
    }
}
    