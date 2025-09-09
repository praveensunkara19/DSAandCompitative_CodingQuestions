package Graphs;

import java.util.*;
public class MST {
	
	static class Pair{
		int node;
		int distance;
		Pair(int node,int distance){
			this.node = node;
			this.distance = distance;
		}
	}

	static class Tuple{
		int dist;
		int node;
		int parent;
		Tuple(int dist,int node,int parent){
			this.dist = dist;
			this.node = node;
			this.parent = parent;
		}
	}
	//if they ask only the sum, dont take the parent into the queue
	public static ArrayList<ArrayList<Pair>> mst(int n,ArrayList<ArrayList<Pair>> graph){
		ArrayList<ArrayList<Pair>> mstPair = new ArrayList<>();
		for(int i=0;i<n;i++) {
			mstPair.add(new ArrayList<>());
		}
		//SC:O(E)
		PriorityQueue<Tuple> pq = new PriorityQueue<>(Comparator.comparingInt(p->p.dist));

		boolean[] visit = new boolean[n];
		
		pq.add(new Tuple(0,0,-1));
		int sum = 0;
		
		//iter over edges E
		// ElogE + ElogE
		while(!pq.isEmpty()) {
			Tuple p = pq.poll();
			int dist = p.dist;
			int node = p.node;
			int parent = p.parent;
			
			//(logE)
			if(!visit[node]) {
				visit[node] = true;
				sum+=dist;
				if(parent != -1) {
				mstPair.get(node).add(new Pair(parent,dist));
				mstPair.get(parent).add(new Pair(node,dist));
				}
				
//				E logE
				for(Pair val:graph.get(node)) {
					int v = val.node;
					int wt = val.distance;
					if(!visit[v]) {
						pq.add(new Tuple(wt,v,node));
					}
				}
			}
			
		}
		System.out.println(sum);
		return mstPair;
	}
	public static void main(String[] args) {
		
		int n = 5;
		ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		graph.get(0).add(new Pair(1,2)); graph.get(0).add(new Pair(2,1));
		graph.get(1).add(new Pair(0,2)); graph.get(1).add(new Pair(2,1));
		graph.get(2).add(new Pair(0,1)); graph.get(2).add(new Pair(1,1));
		graph.get(2).add(new Pair(4,2)); graph.get(2).add(new Pair(3,2));
		graph.get(3).add(new Pair(2,2)); graph.get(3).add(new Pair(4,1));
		graph.get(4).add(new Pair(2,2)); graph.get(4).add(new Pair(3,1));
		
		ArrayList<ArrayList<Pair>> ans = mst(n,graph);
		
		for(int i=0;i<n;i++) {
			System.out.print(i+"->");
			for(Pair val:ans.get(i)) {
				System.out.print("("+val.node+","+val.distance+")");
			}
			System.out.println();
		}
	}
}
