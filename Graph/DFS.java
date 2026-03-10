import java.util.*;

public class Main {

    static void dfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        for(int nei : adj.get(start)){
            if(!visited[nei]){
                dfs(nei, adj, visited);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        boolean[] visited = new boolean[V];

        for(int i = 0; i < E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        dfs(0, adj, visited);
    }
}
