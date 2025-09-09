package Accenture;
import java.util.*;
public class SubArraysSum {

	//kadane's algorithm
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		int  max = Integer.MIN_VALUE;
		
		int[] arr = new int[n];
		for(int  i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum+= arr[i];
			if(sum>max)
				max = sum;
			if(sum < 0)
				sum =0;
//			System.out.println(sum);
				
		}
		System.out.println(max);
		
		
	}		

}
