package Graphs;

import java.util.*;
public class BellmanFordAlgo {
	
	public static int[] bellManFord(int V,int[][] graph,int src) {
		int[] dist = new int[V];
		Arrays.fill(dist, (int)1e8);
		dist[src] = 0;
		
//		O(V X E)
		for(int i=0;i<V-1;i++) {
			for(int[] val:graph) {
			int u = val[0];
			int v = val[1];
			int wt = val[2];
			if(dist[u]!= (int)1e8 && dist[u]+wt < dist[v]) {
				dist[v] = dist[u]+wt;
			}
			}
		}
		//checking further Nth relaxation for negative cycle
		for(int[] val:graph) {
			int u = val[0];
			int v = val[1];
			int wt = val[2];
			if(dist[u] != (int)1e8 && dist[u]+wt<dist[v]) {
//				int[] ans = {-1};
//				return ans;
				return new int[] {-1};
			}
		}
		return dist;
	}
	
	public static void main(String[] args) {
		int V = 6;
		int[][] graph = {
				{3,2,6},
				{5,3,1},
				{0,1,5},
				{1,5,-3},
				{1,2,-2},
				{3,4,-2},
				{2,4,3}
		};
		
		int[] ans = bellManFord(V,graph,0);
		System.out.print(Arrays.toString(ans));
		
		
		
	}
}
