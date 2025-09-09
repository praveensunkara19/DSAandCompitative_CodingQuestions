package Graphs;
import java.util.*;

public class BipartiteDFS {
	
	 private static boolean dfs(int node, int[] visit, ArrayList<ArrayList<Integer>> adj) {
	    	
		 for(int val:adj.get(node)) {
			 if(visit[val] == 0) {
				 visit[val] = -visit[node];
				 if(dfs(val,visit,adj)) return true;
			 }
			 else if(visit[val] == visit[node]) {
				 return false;
			 }
		 }
	    	return false;
	}
    
   public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
	   
	   int[] visit = new int[V+1];
	   Arrays.fill(visit, 0);
	   for(int i=0;i<=V;i++) {
		   if(visit[i] == 0) {
			   visit[i] = 1;
			  if(dfs(i,visit,adj)) return true;
		   }
	   }
	   
	   return false;
   }
    

	public static void main(String[] args) {
        int V = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

     // Define graph edges
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(3).add(5); adj.get(5).add(3);
        adj.get(4).add(8); adj.get(8).add(4);
        adj.get(5).add(7); adj.get(7).add(5);
        adj.get(7).add(8); adj.get(8).add(7);
        adj.get(8).add(9); adj.get(9).add(8);
        adj.get(10).add(9); adj.get(9).add(10);

        boolean res = isBipartite(V, adj);
        System.out.println(res ? "Graph is Bipartite" : "Graph is NOT Bipartite");
    }
}
