package Graphs;
import java.util.*;
public class KosarajuAlgo {
	public static void dfs(int node,ArrayList<ArrayList<Integer>> adjList,Stack<Integer> st, boolean[] visit) {
			visit[node] = true;
			for(Integer val: adjList.get(node)) {
				if(!visit[val])
				dfs(val,adjList,st,visit);
			}
		st.push(node);
	}
	public static void dfs2(int node,ArrayList<ArrayList<Integer>> adjT,boolean[] visit) {
		visit[node] = true;
		System.out.print(node+" ");
		for(Integer val:adjT.get(node)) {
			if(!visit[val]) {
				dfs2(val,adjT,visit);
			}
		}
	}
	public static void scc(int n,ArrayList<ArrayList<Integer>> adjList) {
		Stack<Integer> st = new Stack<>();
		boolean[] visit = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visit[i])
			dfs(i,adjList,st,visit);
		}
//		System.out.print(st);
		
		//reversing the edges of each node of edjList
		ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
		for(int i=0;i<n;i++) {
			adjT.add(new ArrayList<>());
		}
		
//		Arrays.fill(visit, false);
		for(int i=0;i<n;i++) {
			visit[i] = false; //making visit[] to false
			for(Integer val:adjList.get(i)) {
				adjT.get(val).add(i); //reversing the edges of each nodes
			}
		}
		
		int scc = 0;
		while(!st.isEmpty()) {
			int node = st.pop();
			if(!visit[node]) {
				scc++;
				dfs2(node,adjT,visit);
			}
		}
		System.out.println("No.of SCC:"+scc);
		

	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		int n = 8;
		for(int i=0;i<n;i++) {
			adjList.add(new ArrayList<>());
		}
		adjList.get(0).add(1);
		adjList.get(1).add(2);
		adjList.get(2).add(0);
		
		adjList.get(2).add(3);
		
		adjList.get(3).add(4);
		
		adjList.get(4).add(7);
		adjList.get(4).add(5);
		adjList.get(5).add(6);
		adjList.get(6).add(4);
		adjList.get(6).add(7);
		
		for(int i=0;i<n;i++) {
			System.out.print(i + "-->");
			for(int val:adjList.get(i)) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		scc(n,adjList);
		
		
	}

}
