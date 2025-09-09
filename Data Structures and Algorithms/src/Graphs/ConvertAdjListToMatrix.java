package Graphs;

import java.util.*;

public class ConvertAdjListToMatrix {
    public static int[][] convertToMatrix(int V, ArrayList<ArrayList<Integer>> adjList) {
        // Initialize an adjacency matrix with zeros
        int[][] adjMatrix = new int[V][V];
        
        // Iterate through the adjacency list
        for (int i = 0; i < V; i++) {
            for (Integer neighbor : adjList.get(i)) {
                adjMatrix[i][neighbor] = 1; // Add edge
                adjMatrix[neighbor][i] = 1; // Since the graph is undirected
            }
        }
        
        return adjMatrix;
    }
    
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Add edges to adjacency list
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        
        adjList.get(2).add(3);
        adjList.get(3).add(2);
        
        adjList.get(3).add(4);
        adjList.get(4).add(3);
        
        // Convert adjacency list to adjacency matrix
        int[][] adjMatrix = convertToMatrix(V, adjList);
        
        // Print adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

