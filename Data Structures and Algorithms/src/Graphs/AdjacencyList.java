package Graphs;

import java.util.*;

public class AdjacencyList {
	
	public static void main(String[] args) {
		int n=5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ;
		
		for(int i=0;i<=n;i++) {  //if it is 1 index i<=n else i<n  
			adj.add(new ArrayList<>());
		}
		adj.get(1).add(2);
		adj.get(1).add(3);
		
		adj.get(2).add(5);
		adj.get(2).add(1);
		
		adj.get(3).add(1);
		adj.get(3).add(4);
		
		adj.get(4).add(3);
		adj.get(4).add(5);
		
		adj.get(5).add(2);
		adj.get(5).add(4);
		
		for(int i=1;i<=n;i++) {
			System.out.print(i + "-->");
			for(int j = 0;j<adj.get(i).size();j++) {
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+"->");
			for(int val:adj.get(i)) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
