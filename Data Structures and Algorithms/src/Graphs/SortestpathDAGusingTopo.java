package Graphs;

import java.util.*;

public class SortestpathDAGusingTopo {
	static class Pair {
	    int first, second;
	    Pair(int first, int second) {
	        this.first = first;
	        this.second = second;
	    }
	}

    public static void topoSort(int node, Stack<Integer> st, boolean[] visit, ArrayList<ArrayList<Pair>> adj) {
        visit[node] = true;
        for (Pair val : adj.get(node)) {
            if (!visit[val.first]) {
                topoSort(val.first, st, visit, adj);
            }
        }
        st.push(node);
    }

    public static int[] shortestPath(int n, int m, ArrayList<ArrayList<Pair>> adj, int src) {
        Stack<Integer> st = new Stack<>();
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                topoSort(i, st, visit, adj);
            }
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0; // Start from given source node

        while (!st.isEmpty()) {
            int node = st.pop();
            if (dist[node] != Integer.MAX_VALUE) { // Process only reachable nodes
                for (Pair val : adj.get(node)) {
                    int v = val.first;
                    int wt = val.second;
                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int n = 7; // Number of nodes
        int m = 8; // Number of edges

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(6).add(new Pair(4, 2));
        adj.get(6).add(new Pair(5, 3));
        adj.get(5).add(new Pair(4, 1));
        adj.get(4).add(new Pair(0, 3));
        adj.get(4).add(new Pair(2, 1));
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(3, 1));
        adj.get(2).add(new Pair(3, 3));

        int src = 6; // Source node for shortest path
        int[] ans = shortestPath(n, m, adj, src);

        System.out.println("Shortest distances from node " + src + ":");
        System.out.println(Arrays.toString(ans));
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i] == Integer.MAX_VALUE ? "INF " : ans[i] + " ");
//        }
//        System.out.println();

        System.out.println("Graph Representation:");
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + i + " -> ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.first + ", " + p.second + ") ");
            }
            System.out.println();
        }
    }
}
