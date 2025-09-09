package Graphs;

import java.util.*;

public class BFS {

    /**
     * Performs Breadth-First Search (BFS) on the given graph.
     *
     * @param V   The number of vertices in the graph.
     * @param adj The adjacency list representing the graph.
     * @return An ArrayList containing the BFS traversal order of nodes.
     */
    public static  ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
    	
        ArrayList<Integer> bfs = new ArrayList<>(); // List to store the BFS traversal
        boolean[] vis = new boolean[V + 1]; // Visited array to track visited nodes (1-based indexing)
        Queue<Integer> q = new LinkedList<>(); // Queue for BFS traversal

        // Start BFS from node 1
        q.add(1); 
        vis[1] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll(); // Dequeue a node
            bfs.add(node); // Add the node to the BFS traversal list

            // Traverse all adjacent vertices of the dequeued node
            for (Integer n : adj.get(node)) {
                if (vis[n] == false) { 	// If the node is not visited
                    vis[n] = true; 		// Mark it as visited
                    q.add(n); 				// Enqueue the node
                }
            }
        }
        return bfs; // Return the BFS traversal order
    }

    public static void main(String[] args) {
        
        int V = 8;

        // Initialize adjacency list for the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) { // 1-based indexing
            adj.add(new ArrayList<>());
        }

        // Add edges based on the given adjacency list
        adj.get(1).add(2);
        adj.get(1).add(6);

        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);

        adj.get(3).add(2);

        adj.get(4).add(2);
        adj.get(4).add(5);

        adj.get(5).add(4);
        adj.get(5).add(7);

        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(8);

        adj.get(7).add(5);
        adj.get(7).add(6);

        adj.get(8).add(6);

        ArrayList<Integer> result = bfsOfGraph(V, adj);

        // Print the BFS traversal result
        System.out.println("BFS Traversal: " + result);
    }
}
