package Graphs;

import java.util.*;

//perforiming the UnionBySize 

class DisjointSet {
	// created the constructure to initialize the parent,size array.
	int[] parent;
	int[] size;

	DisjointSet(int n) {
		parent = new int[n + 1];
		size = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	// find Ulparent
	public int findUlparent(int node) {
		if (node == parent[node])
			return node;
		return parent[node] = findUlparent(parent[node]);
	}

	// UnionBySize
	void unionBySize(int u, int v) {
		int ulp_u = findUlparent(u);
		int ulp_v = findUlparent(v);
		if (ulp_u == ulp_v)
			return;
		if (size[ulp_u] < size[ulp_v]) {
			parent[ulp_u] = ulp_v;
			size[ulp_v] += size[ulp_u];
		} else if (size[ulp_u] > size[ulp_v]) {
			parent[ulp_v] = ulp_u;
			size[ulp_u] += size[ulp_v];
		} else { // if sizes are same we can add both of them anyway
			parent[ulp_u] = ulp_v;
			size[ulp_v] += size[ulp_u];
		}
	}
}

class Edge implements Comparable<Edge> {
	int wt, u, v;

	Edge(int wt, int u, int v) {
		this.wt = wt;
		this.u = u;
		this.v = v;
	}

	public int compareTo(Edge other_edge) {
		return this.wt - other_edge.wt;
	}

	public String toString() {
		return wt + "," + u + "," + v;
	}
}

public class KrushkalsAlgo extends Disjoint{
	//superclass
	KrushkalsAlgo(int n){
		super(n);
	}

	public static void main(String[] args) {

		int V = 6;
		int[][] edges = { { 3, 2, 3 }, 
				{ 1, 1, 4 }, 
				{ 5, 3, 4 }, 
				{ 2, 1, 2 }, 
				{ 9, 4, 5 }, 
				{ 4, 1, 5 }, 
				{ 8, 2, 6 },
				{ 7, 2, 6 }, };

		ArrayList<Edge> edgeList = new ArrayList<>();
		for (int[] arr : edges) {
			int wt = arr[0];
			int u = arr[1];
			int v = arr[2];
			edgeList.add(new Edge(wt, u, v));
		}
		
//		Collections.sort(arrL, Comparator.comparingInt(i -> i.first));
		
		Collections.sort(edgeList);

		for (Edge val : edgeList) {
			System.out.println(val);
		}
		// got the sorted eges. then we need to do the union of the nodes and save the
		// weight.
		List<Edge> mst = new ArrayList<>();
		int sum = 0;
		KrushkalsAlgo djs = new KrushkalsAlgo(V);
		for (Edge val : edgeList) {
			if (djs.findUlparent(val.u) != djs.findUlparent(val.v)) {
				djs.unionBySize(val.u, val.v);
				sum += val.wt;
				mst.add(new Edge(val.wt, val.u, val.v));
			}
		}

		System.out.println("mimimum weight:" + sum);
		for (Edge val : mst) {
			System.out.println(val);
		}

	}
}