package Graphs;

import java.util.*;

public class ConvertMatrixToAdjList {
    public static ArrayList<ArrayList<Integer>> convertToAdjList(int[][] adjMatrix) {
        int V = adjMatrix.length; // Number of vertices
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Fill adjacency list based on the matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjMatrix[i][j] == 1) {
                    adjList.get(i).add(j); // Add j to the list of i
                    //if weight is given adjList.get(i).add(new Pair(j,adjMatrix[i][j]));
                }
            }
        }
        
        return adjList;
    }
    
    public static void main(String[] args) {
        // Example adjacency matrix
        int[][] adjMatrix = {
            {0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}
        };
        
        // Convert adjacency matrix to adjacency list
        ArrayList<ArrayList<Integer>> adjList = convertToAdjList(adjMatrix);
        
        // Print adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
