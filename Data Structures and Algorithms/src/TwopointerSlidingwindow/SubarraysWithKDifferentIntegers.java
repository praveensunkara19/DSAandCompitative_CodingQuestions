package TwopointerSlidingwindow;

import java.util.*;
public class SubarraysWithKDifferentIntegers {
	
	public static int subArrays(int k,int[] arr) {
		int n = arr.length;
		int count = 0;
		int l=0,r=0;
		int maxf = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(r<n) {
			
			map.put(arr[r], map.getOrDefault(arr[r], 0)+1);
			maxf = Math.max(maxf, map.get(arr[r]));
			
			if(map.size()>k) {
				map.put(arr[r],maxf--);
//				l++;
				
			}
			if(map.size() == k) count++;
			
			r++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4};
		int k = 3;
		int ans = subArrays(k,arr);
		System.out.println(ans);
	}

}
