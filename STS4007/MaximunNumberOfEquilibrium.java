package STS4007;

import java.util.*;

public class MaximunNumberOfEquilibrium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {  //O(n)/O(n)
		arr[i] = sc.nextInt();
		}
		int prefix=0,suffix=0,max=0,point=0;//O(1)
		for(int i=0;i<n;i++) { //O(n^2)
			prefix+=arr[i];
			for(int j=n-1;j>=i;j--) {
				suffix+=arr[j];
			}
			if(prefix == suffix) {
				if(max<prefix) {
					max=prefix;
					point=i;
				}
			}
			suffix =0;
		}//loop
		System.out.println(max +" "+point);
	}

}
