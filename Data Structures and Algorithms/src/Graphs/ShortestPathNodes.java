package Graphs;
import java.util.*;

public class ShortestPathNodes {
	    static class Pair {
	        int first, second;
	        Pair(int first, int second) {
	            this.first = first;
	            this.second = second;
	        }
	    }

	    public static List<Integer> shortestDist(int[][] adjMatrix, int n, int m) {
	        // Construct adjacency list
	        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
	        for (int i = 0; i <= n; i++) {
	            adj.add(new ArrayList<>());
	        }

	        for (int i = 0; i < m; i++) {
	            int u = adjMatrix[i][0];
	            int v = adjMatrix[i][1];
	            int w = adjMatrix[i][2];
	            adj.get(u).add(new Pair(w, v));
	            adj.get(v).add(new Pair(w, u));
	        }
	        
	        System.out.println("graph:");
	        for(int i=0;i<n;i++){
	            System.out.print(i+"->");
	            for(Pair val:adj.get(i)){
	                System.out.print("("+val.first+","+val.second+")");
	            }
	            System.out.println();
	        }
	        // Implement Dijkstra's Algorithm
	        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.first));
	        int[] parent = new int[n + 1];
	        int[] dist = new int[n + 1];
	        Arrays.fill(dist, (int) 1e9);
	        
	        dist[1] = 0;
	        pq.add(new Pair(0, 1)); //dist,src
	        parent[1] = 1;

	        while (!pq.isEmpty()) {
	            Pair node = pq.poll();
	            int wt = node.first;
	            int u = node.second;

	            for (Pair val : adj.get(u)) {
	                if (wt + val.first < dist[val.second]) {
	                    dist[val.second] = wt + val.first;
	                    pq.add(new Pair(dist[val.second], val.second));
	                    parent[val.second] = u;
	                }
	            }
	        }

	        // If the destination is not reachable
	        List<Integer> ans = new ArrayList<>();
	        if (dist[n] == (int) 1e9) {
	            ans.add(-1);
	            return ans;
	        }

	        // Reconstruct path
	        int node = n;
	        while (parent[node] != node) {
	            ans.add(node);
	            node = parent[node];
	        }
	        ans.add(1);
	        Collections.reverse(ans);

	        return ans;
	    }

	    public static void main(String[] args) {
	        int n = 5; // Number of nodes
	        int m = 6; // Number of edges
	        int[][] adjMatrix = {
	            {1, 2, 2},
	            {2, 5, 5},
	            {2, 3, 4},
	            {1, 4, 1},
	            {4, 3, 3},
	            {3, 5, 1}
	        };

	        List<Integer> ans = shortestDist(adjMatrix, n, m);
	        System.out.println(ans);
	    }

}
