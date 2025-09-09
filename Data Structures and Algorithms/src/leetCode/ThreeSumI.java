package leetCode;
/*
 * Time Complexity: Sorting: 𝑂 ( 𝑛 log ⁡ 𝑛 ) 
 * 
 * O(nlogn) Two-pointer search for each element: 𝑂 ( 𝑛 2 ) O(n 2 ) 
 * Overall: 𝑂 ( 𝑛 2 ) O(n 2 ) 
 * 
 * Space Complexity: 𝑂 ( 𝑛 ) O(n) for the result list.
 */
import java.util.*;

class ThreeSumI {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1; // Second pointer
            int k = nums.length - 1; // Third pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    // Add the triplet to the result
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for the second number
                    while (j < k && nums[j] == nums[j + 1]) j++;

                    // Skip duplicate elements for the third number
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    // Move both pointers inward
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--; // Move the right pointer left
                } else {
                    j++; // Move the left pointer right
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
    	ThreeSumI solution = new ThreeSumI();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
