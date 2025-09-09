package algorithms;

/*to print prime numbers*/

import java.util.*;
public class SievesAlgorithm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean arr[] = new boolean[n+1];
		for(int i = 2;i<=n;i++) {
			arr[i] = true;
		}
		for(int i=2;i*i<=n; i++) {
			if(arr[i]==true) {
				for(int j = i*i; j<=n; j+=i) {
					arr[j] = false;
				}
			}
		}
		for(int i = 2 ;i<=n;i++) {
			if(arr[i]==true) {
				System.out.print(i+" ");
			}
		}
	}

}
