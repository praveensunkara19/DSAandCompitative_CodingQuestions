package TCS_CodeVita;

import java.util.*;
public class Max_no_of_steps {
	
	static int movesCoutn(int[][] arr,int[] src, int[] des,int[] mv ) {
		
		if(m==1 || n ==1) return 1;
		return movesCount()
		
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] src = new int[2];
		for(int i=0;i<2;i++) {
			src[i] = sc.nextInt();
		}
		
		int[] des = new int[2];
		for(int i=0;i<2;i++) {
			des[i] = sc.nextInt();
		}
		int[] mv = new int[2];
		for(int i=0;i<2;i++) {
			des[i] = sc.nextInt();
		}
		
		int result = movesCoutn(arr, src, des, mv );
	}

}
