package TwopointerSlidingwindow;

public class ConstantWindowSlidingWind {
	
	public static int maxSum(int k, int[] arr) {
	    int n = arr.length;
	    if (k > n) return -1;

	    int max_sum = 0;
	    int sum = 0;

	    // Initial window
	    for (int i = 0; i < k; i++) {
	        sum += arr[i];
	    }
	    max_sum = sum;

	    // Slide the window
	    for (int i = k; i < n; i++) {
	        sum = sum - arr[i - k] + arr[i];
	        max_sum = Math.max(max_sum, sum);
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
