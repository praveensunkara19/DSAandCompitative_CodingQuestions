package TwopointerSlidingwindow;

public class MaximumPoints {
	public static int maxPoints(int[] arr,int k) {
		int n = arr.length;
		int l_sum = 0;
		int r_sum = 0;
		int max_sum = 0; 
		for(int i=0;i<k;i++) { 		 //O(K)
			l_sum = l_sum + arr[i];
		}
		max_sum = l_sum;  //edge case: for the k elements if the size of arr = k.
		
		int r_index = n-1;
		for(int i=k-1;i>=0;i--) {    //O(k)
			l_sum = l_sum-arr[i];
			r_sum = r_sum + arr[r_index];
			r_index--;
			max_sum = Math.max(max_sum, l_sum + r_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {

		int[] arr = {6,2,3,4,7,2,1,7,1};
		int k = 4;  //window size
		int ans = maxPoints(arr,k);
		System.out.println(ans);
		
		
	}

}
