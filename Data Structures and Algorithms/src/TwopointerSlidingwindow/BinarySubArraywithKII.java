package TwopointerSlidingwindow;

import java.util.*;

public class BinarySubArraywithKII {
	class Solution {
		
		public static int numSubarraysWithSum(int[] nums, int goal) {
			
			Map<Integer, Integer> map = new HashMap<>(); //prefixSumCount
			
			map.put(0, 1); // sum 0 has occurred once before we start
			int sum = 0;
			int count = 0;

			for (int num : nums) {
				sum += num;

				// If (sum - goal) exists, then a subarray sum == goal exists ending here
				count += map.getOrDefault(sum - goal, 0);

				// Record the current prefix sum
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}

			return count;
		}

		public static void main(String[] args) {
			int[] arr = { 1, 0, 1, 0, 1 };// {1,0,0,1,1,0};
			int k = 2;
			int ans = numSubarraysWithSum(arr,k);
			System.out.println(ans);
		}
	}

}
