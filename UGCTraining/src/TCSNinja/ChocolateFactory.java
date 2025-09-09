package TCSNinja;

import java.util.*;
public class ChocolateFactory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] arr1 = new int[n];
		int i1=0;
		
		for(int j = 0;j<n;j++) {
			if(arr[j]!=0) {
				arr[j] = arr1[i1];
				i1++;
			}
			
		}
//		for(int k=i1;k<n;k++) {
//			arr1[k+1] = 0;
//		}
		for(int m =0;m<n;m++) {
			System.out.print(arr1[m]);
		}
	}

}
