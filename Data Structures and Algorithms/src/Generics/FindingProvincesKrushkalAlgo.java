package Generics;

class Disjoint {
    int[] parent;
    int[] size;

    Disjoint(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    // findUlParent with path compression
    public int findUlParent(int node) {
        if (node == parent[node]) return node;
        return parent[node] = findUlParent(parent[node]); // Path compression
    }

    // Union By Size
    public void unionBySize(int u, int v) {
        int ulp_u = findUlParent(u);
        int ulp_v = findUlParent(v);

        if (ulp_u == ulp_v) return; // Already in the same component

        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        } else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
}

public class FindingProvincesKrushkalAlgo{
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Disjoint ds = new Disjoint(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) { // Ensure no self-loops
                    ds.unionBySize(i, j);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ds.findUlParent(i) == i) count++; // Count unique ultimate parents
//            if(ds.parent[i] == i) count++
        }

        return count;
    }
    public static void main(String[] args) {
    	int[][] adjMat = {
    				{1,1,0},
    				{1,1,0},
    				{0,0,1}
    	};
		int ans = findCircleNum(adjMat);
		System.out.println(ans);
	}
}
