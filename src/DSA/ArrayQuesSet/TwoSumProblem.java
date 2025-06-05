package anonymousQuesSet;

import java.util.HashMap;

/* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

public class TwoSumProblem {
    public static void main(String[] args) {
        TwoSumProblem solution = new TwoSumProblem();
        int[] nums = { 7, 11,2, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++)
        //     for (int j = i + 1; j < nums.length; j++) {

        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), i};
            else
                map.put(nums[i],i);
        }
            return null;
    }
}