package Graphs;

import java.util.*;
public class FloyedWarshallAlgo {
	public static int[][] shortestPath(int[][] mat){
		
		int n = mat.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] == -1) {
					mat[i][j] = (int)(1e9);
				}
				if(i==j) {
					mat[i][j] = 0;
				}
			}
		}
		//iterating through each node(via element) 
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					mat[i][j] = Math.min(mat[i][j], mat[i][k]+mat[k][j]);
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] == (int)(1e9)){
					mat[i][j] = -1;
				}
			}
		}
		
		return mat;
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] mat = {
				{0,1,43},
				{1,0,6},
				{-1,-1,0}
		};
		
		int[][] ans = shortestPath(mat);
		
		//To detect negative cycle
		for(int i=0;i<n;i++) {
			if(ans[i][i]<0) {
				System.out.println("negative cycle detected");
			}
			break;
		}
		
		for(int[] arr:ans)
		System.out.println(Arrays.toString(arr));
	}
}
