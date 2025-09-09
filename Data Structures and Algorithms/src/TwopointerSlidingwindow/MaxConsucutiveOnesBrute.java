package TwopointerSlidingwindow;

public class MaxConsucutiveOnesBrute {
	public static int maxOnes(int k,int[] arr) {
		int n = arr.length;
		int maxlen = 0;
		for(int i=0;i<n;i++) {
			
			int z = 0;
			for(int j=i;j<n;j++) {
				if(arr[j] == 0) {
					z++;
				}
				if(z <= k) {
					maxlen = Math.max(maxlen, j-i+1);
				}
				else {
					break;
				}
			}
		}
		
		return maxlen;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int ans = maxOnes(k,arr);
		System.out.println(ans);
	}

}
