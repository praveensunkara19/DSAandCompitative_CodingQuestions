package leetCode;

import java.util.*;

public class FindAllDuplicatesinanArray {
//	class Solution {

	    public static List<Integer> findDuplicates(int[] nums) {
	        int n = nums.length;
	        ArrayList<Integer> arr = new ArrayList<>();
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<n;i++){
	            if(map.containsKey(nums[i])){
	               map.put(nums[i], map.get(nums[i])+1);
	               if(map.get(nums[i]) == 2){
	                arr.add(nums[i]);
//	                System.out.println(arr);
	               }
	            }
	            else{
	                map.put(nums[i],1);
	            }
	        }

	        return arr;
	    }
//	}
public static void main(String[] args) {
	int[] nums = {4,3,2,7,8,2,3,1};
	
	System.out.println(findDuplicates(nums));
	
}
}
