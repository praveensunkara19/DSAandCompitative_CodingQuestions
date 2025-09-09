package Graphs;
/*
 * finding the shortest path using the bfs and dis[]
 */
import java.util.*;
public class ShortestPathUndirectedGraph {
	static class Pair{
		int first;
		int second;
		Pair(int first,int second){
			this.first = first;
			this.second = second;
		}
	}
	
	public static int[] shortestPath(int i,ArrayList<ArrayList<Integer>> adj,int src) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(src,0));
		
		int[] dist = new int[i];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src] = 0;
		
		
		while(!q.isEmpty()) {
			Pair node = q.poll();
			int v = node.first; //0
			int wt = node.second; //0
			if(dist[v] != Integer.MAX_VALUE)
				
				/*"following the general bfs and distance[] approch"
				 * for(int val: adj.get(node){
				 *  if(dist[node] + 1 < dist[val]){
				 *  	dist[val] = dist[node] + 1;
				 *  	q.add(val);
				 *  }
				 *  }
				 */
			for(int val : adj.get(v)) {
				if(wt + 1  < dist[val]) {
					dist[val] = wt + 1;
					q.add(new Pair(val,dist[val]));
				}
			}
		}
		return dist;
	}
	
	public static void main(String[] args) {
		int v = 9;
		int src = 0;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(0).add(1); adj.get(1).add(0);
		adj.get(0).add(3); adj.get(3).add(0);
		adj.get(1).add(3); adj.get(3).add(1);
		adj.get(1).add(2); adj.get(2).add(1);
		adj.get(3).add(4); adj.get(4).add(3);
		adj.get(4).add(5); adj.get(5).add(4);
		adj.get(5).add(6); adj.get(6).add(5);
		adj.get(6).add(7); adj.get(7).add(6);
		adj.get(2).add(6); adj.get(6).add(2);
		adj.get(7).add(8); adj.get(8).add(7);
		adj.get(6).add(8); adj.get(8).add(6);
		
		
		int[] ans = shortestPath(v,adj,src);
		System.out.print(Arrays.toString(ans));
	} 

}
