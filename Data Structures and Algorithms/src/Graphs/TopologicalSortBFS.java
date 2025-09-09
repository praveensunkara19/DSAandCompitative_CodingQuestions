package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

//kahns algorithm

public class TopologicalSortBFS {
	
	public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		
		int[] ans = new int[V];
		
		//to catculate the indegre
		int[] indig = new int[V];
		for(int i=0;i<V;i++) {
			for(int val : adj.get(i)) {
				indig[val]++;
			}
		}
		System.out.println("indigree arr:"+Arrays.toString(indig));
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<V;i++) {
			if(indig[i]==0) {
				q.add(i);
			}
		}
		
		int index = 0;
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int val : adj.get(node)) { //removing the edges of indig-0 node
				indig[val]--;
				if(indig[val] == 0) {     //if any indig = 0 adding it to q 
					q.add(val);
				}
			}
			
			ans[index++] = node; 
		}
		
		
		
		return ans;
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
