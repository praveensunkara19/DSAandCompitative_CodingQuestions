package algorithms;

import java.util.Scanner;
public class HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int sum =0;
		int max = 0;
		
		if(r>=3 && c>=3) {
			int[][] arr = new int[r][c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<r-2;i++) {
				for(int j=0;j<c-2;j++) {
					max = arr[i][j] + arr[i][j+1] + arr[i][j+2]+
							arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j+2];
				}
				max = Math.max(max, sum);
			}
			
		}
		else {
			System.out.println("tthe rows and colomn should minimum 3");
		}
		System.out.println(max);
	}

}
