package TCSNinja;

import java.util.Scanner;
public class GreaterElementsThanIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count =1;
		int a = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>a) {
				count++;
			}
		}
		System.out.print(count);
	}

}
