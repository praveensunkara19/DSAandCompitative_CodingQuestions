package Graphs;

import java.util.*;
public class DetectCycleUndirectedGraphDFS {
	
	
	public static boolean detectCycle(int src,int parent, boolean[] visit, ArrayList<ArrayList<Integer>> adj) {
		
		visit[src] = true;
		for(Integer neighbor : adj.get(src)) {
			if(visit[neighbor] == false) {
				detectCycle(neighbor,src,visit,adj);
			}
			else if( neighbor != parent) {
				return true;
			}
		}
		return false;
	}
	 
	public static boolean isCycleDFS(int V,ArrayList<ArrayList<Integer>> adj) {
		
		boolean[] visit = new boolean[V+1];
		
		for(int i=1;i<=V;i++) {
			if(visit[i] == false) {
				if(detectCycle(i,-1,visit,adj)) return true;
			}
		}
		return false;
	}
	
		public static void main(String[] args) {
			int V = 8;
			ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
			for(int i = 0; i <= V; i++) {
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
			
//			adj.get(1).add(2);
//			adj.get(1).add(3);
//			
//			adj.get(2).add(4);
//			adj.get(2).add(1);
//			
//			adj.get(3).add(1);
//			adj.get(3).add(5);
//			
//			adj.get(4).add(5);
//			adj.get(4).add(2);
//			
//			adj.get(5).add(4);
//			adj.get(5).add(3);
			
			boolean ans = isCycleDFS(V, adj);
			System.out.println(ans);
		}
	}

