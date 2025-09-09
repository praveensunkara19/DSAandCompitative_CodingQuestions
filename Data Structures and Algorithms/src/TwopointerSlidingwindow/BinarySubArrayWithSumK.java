package TwopointerSlidingwindow;

public class BinarySubArrayWithSumK {
	public static int binarySubArray(int k,int[] arr) {
		int n = arr.length;
		int l=0,r=0;
		int count = 0;
		int sum = 0;
		while(r<n) {
			sum = sum +arr[r];
			if(sum <=k) {
				count = count + r-l+1;
			}
			else {
				l++;
				sum--;
				count+=r-l+1;
			}
			r++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1};//{1,0,0,1,1,0};
		int k = 2;
		int ans = binarySubArray(k,arr);
		System.out.println(ans);
	}

}
