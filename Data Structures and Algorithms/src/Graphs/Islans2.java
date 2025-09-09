package Graphs;
import java.util.*;
class Disjoint{
	int[] parent;
	int[] size;
	Disjoint(int n){
		parent = new int[n];
		size = new int[n];
		for(int i=0;i<n;i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}
	public int findUlParent(int node) {
		if(node == parent[node]) return node;
		return parent[node] = findUlParent(parent[node]);
	}
	public void unionBySize(int u,int v) {
		int ulp_u = findUlParent(u);
		int ulp_v = findUlParent(v);
		if(ulp_u == ulp_v) return;
		else if(parent[ulp_u]<parent[ulp_v]) {
			parent[ulp_u] = ulp_v;
			size[ulp_v]+=size[ulp_u];
		}
		else {
			parent[ulp_v]=ulp_u;
			size[ulp_u]+=size[ulp_v];
		}
	}
}

public class Islans2 {
	public static List<Integer> noofIslands(int n ,int m,int[][] operations) {

		Disjoint ds = new Disjoint(n*m);
		
		int[][] visit = new int[n][m];
		List<Integer> ans = new ArrayList<>();
		int count = 0;
		for(int[] it:operations) {
			int i = it[0];
			int j = it[1];
			if(visit[i][j] == 1) {
				ans.add(count);
				continue;
			}
			else {
				visit[i][j] = 1;
				count++;
				int[] delR = {-1,0,1,0};
				int[] delC = {0,1,0,-1};
				for(int k=0;k<4;k++) {
					int nRow = delR[k]+i;
					int nCol =  delC[k]+j;
					if(nRow>=0&&nRow<n && nCol>=0&&nCol<m &&
							visit[nRow][nCol]==1) {
						int node = i*m + j;
						int adjnode = nRow*m + nCol;
						if(ds.findUlParent(node) != ds.findUlParent(adjnode)) {
							count--;
							ds.unionBySize(node,adjnode);
						}
					}
				}
			}
			ans.add(count);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		int[][] operations = {
				{0,0},
				{1,1},
				{1,0},
				{0,1},
				{0,3},
				{1,3},
				{0,4},
				{3,2},
				{2,2},
				{1,2},
				{0,2}
		};
		
		List<Integer> ans = noofIslands(n,m,operations);
		System.out.println(ans);
	}

}
