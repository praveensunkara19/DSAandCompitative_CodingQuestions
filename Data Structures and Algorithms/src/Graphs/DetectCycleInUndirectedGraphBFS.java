package Graphs;

import java.util.*;

public class DetectCycleInUndirectedGraphBFS {
	
	static class Pair{
		int first;
		int second;
		Pair(int first, int second){
			this.first = first;
			this.second = second;
		}
	}
	
	public static boolean checkCycle(int src, boolean[] visit, ArrayList<ArrayList<Integer>> adj) {
		Queue<Pair> q = new LinkedList<>();
		
		visit[src] = true;
		q.add(new Pair(src, -1));
		
		while(!q.isEmpty()) {
			Pair cur = q.peek();
			int node = cur.first;
			int parent = cur.second;
			q.remove();
	
			for(Integer val : adj.get(node)) {
				if(!visit[val]) {
					visit[val] = true;
					q.add(new Pair(val, node));
				}
				else if(parent != val) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean visit[] = new boolean[V];
		
		// Corrected loop to start from 0
		for(int i = 0; i < V; i++) {
			if(visit[i] == false) {
				if(checkCycle(i, visit, adj) ) { 
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int V = 8;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(1).add(2);
		adj.get(1).add(3);
		
		adj.get(2).add(4);
		adj.get(2).add(1);
		
		adj.get(3).add(5);
		adj.get(3).add(1);
		adj.get(3).add(7);
		
		adj.get(4).add(6);
		adj.get(4).add(2);
		
		adj.get(5).add(7);
		adj.get(5).add(3);
		
		adj.get(6).add(5);
		adj.get(6).add(4);
		
		adj.get(7).add(3);
		
		boolean ans = isCycle(V, adj);
		System.out.println(ans);
	}
}
