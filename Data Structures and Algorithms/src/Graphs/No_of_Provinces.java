package Graphs;

import java.util.*;

public class No_of_Provinces {
	
	public  static void dfs(int node,boolean[] visit, ArrayList<ArrayList<Integer>> adj) {
		
		visit[node] = true;
		for(Integer val : adj.get(node)) {
			if(visit[val] == false) {
				dfs(val,visit,adj);
			}
		}
		
		
	}
	public static void bfs(int node, boolean[] visit,ArrayList<ArrayList<Integer>> adj) {
		Queue<Integer> q = new  LinkedList<>();
		
		visit[node] = true;
		q.add(node);
		
		while(!q.isEmpty()) {
			Integer curr = q.poll();
			
			for(Integer val : adj.get(curr)) {
				if(visit[val] == false) {
					visit[val] = true;
					q.add(val);
				}
		}
		}
		
	}
	
    public static int provinces(int V, ArrayList<ArrayList<Integer>> adj) {
    	int count =0;
    	boolean[] visit = new boolean[V+1];
    	
    	
    	for(int i=1;i<=V;i++) {
    		if(visit[i] == false) {
//    			dfs(i,visit,adj);
    			bfs(i,visit,adj);
    			count++;
    		}
    		
    	}
    	
    	return count;
    }
    

    public static void main(String[] args) {
        int V = 8; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        
        adj.get(1).add(2);
        adj.get(2).add(1); // Since it's an undirected graph
        
        adj.get(2).add(3);
        adj.get(3).add(2); 
        
        adj.get(4).add(5);
        adj.get(5).add(4); 
        
        adj.get(5).add(6);
        adj.get(6).add(5); 
        
        adj.get(7).add(8);
        adj.get(8).add(7); 
        
        int result = provinces(V, adj);
        
        System.out.println(result);
    }
}
