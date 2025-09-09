package Graphs;
import java.util.*;

public class BipartitieBFS {
    
    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V + 1]; 
        Arrays.fill(color, 0); 
        
        
     // Ensure all nodes are checked (disconnected graphs)
        for (int i = 1; i <= V; i++) { 
            if (color[i] == 0) { 			// If node is unvisited, start BFS
                if (!bfsCheck(i, adj, color)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean bfsCheck(int start, ArrayList<ArrayList<Integer>> adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 1; // Start with color 1

        while (!q.isEmpty()) {
            int node = q.poll();
            for (Integer neighbor : adj.get(node)) {
                if (color[neighbor] == 0) { 				// If unvisited, assign opposite color
                    color[neighbor] = -color[node];
                    q.add(neighbor);
                } else if (color[neighbor] == color[node]) { // If same color, not bipartite
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int V = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define graph edges
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(3).add(5); adj.get(5).add(3);
        adj.get(6).add(4); adj.get(4).add(6);
        adj.get(6).add(8); adj.get(8).add(6);
        adj.get(7).add(8); adj.get(8).add(7);
        adj.get(8).add(9); adj.get(9).add(8);
        adj.get(10).add(9); adj.get(9).add(10);

        boolean res = isBipartite(V, adj);
        System.out.println(res ? "Graph is Bipartite" : "Graph is NOT Bipartite");
    }
}
