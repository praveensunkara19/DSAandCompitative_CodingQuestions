package Graphs;
import java.util.*;

public class TopologicalSort {
	
	public static void dfs(int node, boolean[] visit, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
		visit[node] = true;
		for (Integer val : adj.get(node)) {
			if (!visit[val]) {
				dfs(val, visit, st, adj);
			}
		}
		// Push node after visiting all its neighbors
		st.push(node);
	}
	
	public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		int[] ans = new int[V];  
		boolean[] visit = new boolean[V];  
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < V; i++) {  
			if (!visit[i]) {
				dfs(i, visit, st, adj);
			}
		}
		
		int index = 0;
		while (!st.isEmpty()) {
			ans[index++] = st.pop();
		}
		return ans;  // Return topologically sorted elements
	}

	public static void main(String[] args) {
		int V = 6;  // Fix the number of vertices
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < V; i++) {  // Fix indexing
			adj.add(new ArrayList<>());
		}

		// Define directed edges
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(4).add(0);
		adj.get(4).add(1);
		adj.get(5).add(0);
		adj.get(5).add(2);
		
		int[] res = topoSort(V, adj);
		System.out.println("Topological Sort Order: " + Arrays.toString(res));
		
		for(int i=0;i<V;i++) {
			System.out.print(i+"->");
			for(int j:adj.get(i)) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
