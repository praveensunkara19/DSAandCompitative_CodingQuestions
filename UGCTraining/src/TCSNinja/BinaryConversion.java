package TCSNinja;

import java.util.Scanner;
import java.lang.*;

public class BinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String b = Integer.toBinaryString(n);
//		System.out.print(b);
		
		int[] arr = new int[b.length()];
		
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i) == '0') {
				arr[i] = 1;
			}
			else if ( b.charAt(i) == '1'){
				arr[i] = 0;
			}
		}
		
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[j]);
//		}
//		
//		System.out.println(arr.length);
		
		int sum =0;
		int count =0; 
		for(int i=arr.length-1;i>=0;i--) {

			sum = (int) (sum + arr[i] * Math.pow(2,count)); // ...+2+1
			count++;
		}
		System.out.println(sum);
		
	}

}
