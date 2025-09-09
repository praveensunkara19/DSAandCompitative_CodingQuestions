package TwopointerSlidingwindow;
//brute force
public class ConstantWindowSumBruteforce {
	public static int maxSum(int k, int[] arr) {
		int n = arr.length;
		int max_sum = 0;

		for (int i = 0; i < n; i++) { // O(N*k)
			if (i + k <= n) { // ensures we have at least 4 elements to form a window
				int sum = 0;
				for (int j = i; j < i + k; j++) {
					sum += arr[j];
				}
				max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {-1,2,3,4,5,-1};
		int k = 4;
		int ans =  maxSum(k,arr);
		System.out.println(ans);
	}

}
