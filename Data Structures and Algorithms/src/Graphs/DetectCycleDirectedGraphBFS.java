package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Topological Approch
public class DetectCycleDirectedGraphBFS {
	
	public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		
		//indig
		int[] indig = new int[V];
		for(int i=0;i<V;i++) {
			for(int val:adj.get(i)) {
				indig[val]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<V;i++) {
			if(indig[i] == 0) { 
				q.add(i);
			}
		}
		
		int cnt = 0;
		while(!q.isEmpty()) {
			int node = q.poll();
			cnt++;
			for(int val:adj.get(node)) {
				indig[val]--;
				if(indig[val]==0) {
					q.add(val);
				}
			}
		}
		//if the cylce is fount, the iteration breaks and dont return all the valuse
		//to the sorting for toposort indicate there is loop(toposort fail)
		
		if(cnt != V) return true;
		
		return false;
	}

	
	public static void main(String[] args) {
		int V = 7;  // Fix the number of vertices
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < V; i++) {  // Fix indexing
			adj.add(new ArrayList<>());
		}

		// Define directed edges
		adj.get(1).add(2);
		adj.get(2).add(3);
		adj.get(3).add(4);
		adj.get(4).add(2);
		adj.get(3).add(5);
		adj.get(5).add(6);
		
		boolean res = topoSort(V, adj);
		System.out.println("Cycle detected"+res );
		
		for(int i=0;i<V;i++) {
			System.out.print(i+"->");
			for(int j:adj.get(i)) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
