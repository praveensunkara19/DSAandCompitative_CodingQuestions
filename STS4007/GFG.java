package STS4007;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.lang.Math;

public class GFG {
	
	// Function to find maximum equilibrium
	// sum.
	static int findMaxSum(int[] arr, int n)
	{
		int sum = IntStream.of(arr).sum();
		int prefix_sum = 0,
				
		res = Integer.MIN_VALUE;
//		System.out.println(res);
//		System.out.println(sum);
		
		for (int i = 0; i < n; i++)
		{
			prefix_sum += arr[i];
			
			if (prefix_sum == sum)
				res = Math.max(res, prefix_sum);
			sum -= arr[i];
		}
		
		return res;
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int arr[] = { -2, 5, 3, 1,
					2, 6, -4, 2 };
		int n = arr.length;
//		int n = sc.nextInt();
//		
//		ArrayList<Integer> arrList  = new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			arrList.add(sc.nextInt());
//		}
//		int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();
		System.out.print(findMaxSum(arr, n));
	}
}
