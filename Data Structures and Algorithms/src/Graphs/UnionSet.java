package Graphs;

class Disjoint{
	int[] rank;
	int[] parent;
	int[] size;
	Disjoint(int n){
		rank = new int[n+1];
		parent = new int[n+1];
		size = new int[n+1];
		for(int i=0;i<=n;i++) {
			rank[i] = 0;
			parent[i] = i;
			size[i] = 1;
		}
	}
	
	public int findUlparent(int node) {
		if(node == parent[node]) return node;      //base case
		parent[node] = findUlparent(parent[node]);  //recursive statement
		return parent[node];						//return statement
	}
	
	public void unionByRank(int u,int v) {
		int ulp_u = findUlparent(u);
		int ulp_v = findUlparent(v);
		
		//not compare the ul parents.compare with the rank/size of each node.
		if(ulp_u == ulp_v) return;  //already connected and has same parent.
		if(rank[ulp_u] < rank[ulp_v]) {
			parent[ulp_u] = ulp_v;
		}
		else if(rank[ulp_u] > rank[ulp_v]){
			parent[ulp_v] = ulp_u;
		}
		else {
			//if both are same,you can add eigter ulp_u to ulp_v or vase versa
			parent[ulp_v] = ulp_u;
			rank[ulp_u]++;
		}
	}
	
	void unionBySize(int u,int v) {
		int ulp_u = findUlparent(u);
		int ulp_v = findUlparent(v);
		if(ulp_u == ulp_v) return;
		if(size[ulp_u] < size[ulp_v]) {
			parent[ulp_u] = ulp_v;
			size[ulp_v]+=size[ulp_u];
		}
		else if(size[ulp_u]>size[ulp_v]) {
			parent[ulp_v] = ulp_u;
			size[ulp_u]+=size[ulp_v];
		}
		else { //if sizes are same we can add both of them anyway
			parent[ulp_u] = ulp_v;
			size[ulp_v]+= size[ulp_u];
		}
	}
	
}
public class UnionSet {
	public static void main(String[] args) {
		
		Disjoint ds = new Disjoint(7);
		Disjoint ds2 = new Disjoint(7);
		
		ds.unionByRank(1, 2);
		ds.unionByRank(2, 3);
		ds.unionByRank(4, 5);
		ds.unionByRank(6, 7);
		ds.unionByRank(5, 6);
		
		//bysize
		ds2.unionBySize(1, 2);
		ds2.unionBySize(2, 3);
		ds2.unionBySize(4, 5);
		ds2.unionBySize(6, 7);
		ds2.unionBySize(5, 6);
		
		if(ds.findUlparent(3) == ds.findUlparent(7)) {
			System.out.println("same, connected component");
		}
		else {
			System.out.println("not same, not a connected component");
		}
		ds.unionByRank(3,7);
		System.out.println(ds.findUlparent(3)==ds.findUlparent(7)?"same":"not same");
		
		System.out.println("by Size method");
		
		System.out.println(ds2.findUlparent(3)==ds2.findUlparent(7)?"same":"not same");
		ds2.unionBySize(3, 7);
		System.out.println(ds2.findUlparent(3)==ds2.findUlparent(7)?"same":"not same");
	}
}
