package Graphs;

import java.util.*;
public class DijkstraAlgoPriorityQueue {
	static class Pair{
		int first;
		int second;
		Pair(int first,int second){
			this.first = first;
			this.second = second;
		}
	}
	//shortest path using priority dqueue. , we dont need pair values.
	public static int[] shortestPath(int n, ArrayList<ArrayList<Pair>> adj,int src) {
		
		PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p->p.second));
//		Queue<Pair> pq = new LinkedList<>();
		int[] dist = new int[n];
		Arrays.fill(dist,Integer.MAX_VALUE);
		
		dist[src]=0;
		pq.add(new Pair(src,0)); //put the src node and its initial weight
		
		while(!pq.isEmpty()) {
			Pair node = pq.poll();
			int u = node.first;
			if(dist[u]!=Integer.MAX_VALUE);
//			int wt = node.second;
			for(Pair v:adj.get(u)) {
				if(dist[u] + v.second < dist[v.first]) {
					dist[v.first] = dist[u] + v.second;
					pq.add(new Pair(v.first,dist[v.first]));
				}
			}
			
		}
		
		
		return dist;
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		int n = 6;
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Pair>());
		}
		
		adj.get(0).add(new Pair(1,4));
		adj.get(0).add(new Pair(2,4));
		
		adj.get(1).add(new Pair(0,4));
		adj.get(1).add(new Pair(2,2));
		
		adj.get(2).add(new Pair(0,4));
		adj.get(2).add(new Pair(1,4));
	
		adj.get(2).add(new Pair(3,3));
		adj.get(2).add(new Pair(4,1));
		adj.get(2).add(new Pair(5,6));
		
		adj.get(3).add(new Pair(2,3));
		adj.get(3).add(new Pair(5,2));
		
		adj.get(4).add(new Pair(2,1));
		adj.get(4).add(new Pair(5,3));
		
		adj.get(5).add(new Pair(3,2));
		adj.get(5).add(new Pair(2,6));
		adj.get(5).add(new Pair(4,3));
		
		int src = 0;
		int[] ans = shortestPath(n,adj,src);
		
		System.out.println(Arrays.toString(ans));
		
		for(int i=0;i<n;i++) {
			System.out.print(i+" -->");
			for(Pair val:adj.get(i)) {
				System.out.print("("+val.first+","+val.second+")");
			}
			System.out.println();
		}
		
		
		
	}

}
