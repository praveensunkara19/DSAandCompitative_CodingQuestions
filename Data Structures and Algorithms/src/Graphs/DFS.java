package Graphs;

import java.util.*;

public class DFS {

    
    public static void dfs(int node, boolean[] visit, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> resDfs) {
        // Mark the current node as visited and add it to the result
        visit[node] = true;
        resDfs.add(node);

        // Traverse all adjacent nodes
        for (Integer val : adj.get(node)) {
            if (visit[val] == false) { 			// If the node is not visited, recursively visit it
                dfs(val, visit, adj, resDfs);
            }
        }
    }

    
    
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> resDfs = new ArrayList<>(); 
        boolean[] visit = new boolean[V + 1]; 		// Visited array (1-based indexing)

        // Start DFS from node 1 (assuming 1-based graph)
        dfs(1, visit, adj, resDfs);

        return resDfs;
    }

    public static void main(String[] args) {
        int V = 8;

        // Adjacency list for the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize the adjacency list
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges based on the given adjacency list
        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);

        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);

        adj.get(4).add(3);
        adj.get(4).add(8);

        adj.get(5).add(2);

        adj.get(6).add(2);

        adj.get(7).add(3);
        adj.get(7).add(8);

        adj.get(8).add(4);
        adj.get(8).add(7);

        ArrayList<Integer> result = dfsOfGraph(V, adj);

        System.out.println("DFS Traversal: " + result);
    }
}
