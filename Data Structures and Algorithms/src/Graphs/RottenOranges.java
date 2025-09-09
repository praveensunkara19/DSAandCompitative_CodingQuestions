package Graphs;

import java.util.*;
public class RottenOranges {
	
	static class Pair{
		int row,col,tm;
		public Pair(int row,int col,int tm) {
			this.row = row;
			this.col = col;
			this.tm = tm;
		}
	}
	
	
	public static int rottenOranges(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		
		Queue<Pair> q = new LinkedList<>();
		int[][] visit = new int[n][m];
		int cntFresh = 0; 				//to count the fresh oranges
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(grid[i][j]==2) {
					q.add(new Pair(i,j,0));
					visit[i][j] = 2;
				}
//				else {
//					visit[i][j] = 0;
//					
//				}
				else if(grid[i][j] == 1) cntFresh++;
			}
		}
		
		int tm = 0;
		int[] delRow = {0,+1,0,-1};
		int[] delCol = {-1,0,+1,0};
		int count =0;
		while(!q.isEmpty()) {
			int r = q.peek().row;
			int c = q.peek().col;
			int t = q.peek().tm;
			tm = Math.max(tm, t);
			q.remove();
			
			for(int i=0;i<4;i++) {
				int nrow = r+delRow[i];
				int ncol =  c+delCol[i];
				if(nrow>=0&&nrow<n && ncol>=0&&ncol<m &&
						grid[nrow][ncol]==1 && visit[nrow][ncol]!=2) {
					visit[nrow][ncol] = 2;
					count++;					//tracking the no.of freshtomatos rottening
					q.add(new Pair(nrow,ncol,t+1));
				}
			}
		}
		
		if(count != cntFresh) {
			return -1;
		}
		
		return  tm;
	}
	

	public static void main(String[] args) {
		
		int[][] grid = {
				{2,1,1},
				{1,1,0},
				{0,1,1}
		};
		
		int resut1 = rottenOranges(grid);
		System.out.println(resut1);
	}
}
