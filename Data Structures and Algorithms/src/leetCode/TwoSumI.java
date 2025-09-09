package leetCode;

import java.util.*;
public class TwoSumI {
	public static int[] twoSum(int[] nums,int target) {
		Arrays.sort(nums);
		int[] result = new int[2];
		int i=0;
		int k = nums.length-1;
		int sum =0;
		while(true) {
		sum = nums[i] + nums[k];
		if(sum == target) {
			result[0]=nums[i];
			result[1]=nums[k];
			break;
		}
		else if(sum > target) {
			k--;
		}
		else {
			i++;
		}
		
	}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {2, 11, 7, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
	}

}
