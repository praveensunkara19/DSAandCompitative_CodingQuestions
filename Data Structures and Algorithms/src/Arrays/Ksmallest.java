package Arrays;

/*
 * finding the kth smallest using the brutforce approch.
 * i.e : sorting the array then printing the arr[k-1];
 */


import java.util.*;
public class Ksmallest {
	
	static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		sort(arr);
		System.out.println(arr[k-1]);
		
		for(int v : arr) {
			System.out.print(v+" ");
		}
	
	}
}
