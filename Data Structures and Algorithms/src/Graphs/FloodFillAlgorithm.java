package Graphs;

public class FloodFillAlgorithm {
	
	public static void dfs(int row, int col, int[][] ans, int[][] image, int newColor,
			 int iniColor) {
		
		ans[row][col] = newColor;
		int n = image.length;
		int m = image[0].length;
		
		int[] delRow = {-1,0,+1,0};
		int[] delCol = {0,+1,0,-1};
		
		/*iterating over the neighbours, marking the same valued 
		neighbours if they are not marked. */
		for(int i=0;i<4;i++) {
			int nrow = row + delRow[i];
			int ncol = col + delCol[i];
			if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
					image[nrow][ncol] == iniColor && ans[nrow][ncol] == iniColor) { //checking the neighbors in image[][] and assigning newcolor in ans[][]
				dfs(nrow,ncol,ans,image,newColor,iniColor);
			}
		}
		
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
		int iniColor = image[sr][sc];
		int[][] ans = image;
		
		//neighbour nodes
//		int[] delRow = {-1,0,+1,0};
//		int[] delCol = {0,+1,0,-1};
		
		dfs(sr,sc,ans,image,newColor,iniColor);
		
		return ans;
	}

	public static void main(String[] args) {
		int[][] image= {
				{1,1,1,1},
				{2,2,1,1},
				{2,2,2,1}
		};
		int sr = 2;
		int sc = 0;
		int newColor = 3;
		int[][] ans = floodFill(image,sr,sc,newColor);
		
//		System.out.println(ans);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
