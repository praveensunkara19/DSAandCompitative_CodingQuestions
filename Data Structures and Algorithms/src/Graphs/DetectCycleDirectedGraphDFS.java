package Graphs;

import java.util.ArrayList;
public class DetectCycleDirectedGraphDFS {
	
	public static boolean dfs(int node,boolean[] visit,boolean[] pathVis,ArrayList<ArrayList<Integer>> adj) {
		
		
		visit[node] = true;
		pathVis[node] = true;
		for(Integer val : adj.get(node)) {
			//if node is not visited
			if(visit[val] == false) {
				if(dfs(val,visit,pathVis,adj)) return true;
			}
			
			//if the node has been previously visited
			//but it has to be visited on the same path
			else if(pathVis[val] == true) {
				return true;
			}
		}
		
		
		pathVis[node]=false;
		return false;
	}
	
	public static boolean isCycle(int V,ArrayList<ArrayList<Integer>> adj) {
		
		boolean visit[] = new boolean[V+1];
		boolean pathVis[] = new boolean[V+1]; 
		
		for(int i=1;i<=V;i++) {
			if(visit[i] == false) {
				if(dfs(i,visit,pathVis,adj)) return true;
			}
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();
		int V = 10;
		for(int i=0;i<=V;i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(1).add(2);
		
		adj.get(2).add(3);
		adj.get(3).add(4);
		adj.get(3).add(5);
		adj.get(4).add(6);
		adj.get(5).add(6);
		adj.get(6).add(7);
		
		adj.get(8).add(2);
		adj.get(8).add(9);
		adj.get(9).add(10);
		adj.get(10).add(8);
		
//		for(int i=0;i<=V;i++) {
//			System.out.print(i + "->");
//			for(Integer val:adj.get(i)) {
//				System.out.print(val);
//			}
//			System.out.println();
//		}
		
		boolean res = isCycle(V,adj);
		System.out.println(res);
	}

}
