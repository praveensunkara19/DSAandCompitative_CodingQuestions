package algorithms;

import java.util.Scanner;
public class BlockSwaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the block length:");
		int r = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		if(r<0) {
			System.out.println("enter the positive value:");
		}
		else {
			r = r%arr.length;
			System.out.println("swapping the block of length:"+ r);
			for(int i = r;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
			for(int i = 0;i<r;i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
