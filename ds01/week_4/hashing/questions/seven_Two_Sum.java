import java.util.HashMap;

public class seven_Two_Sum {
    public static void main(String[] args) {
        
    }
    /*
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


     */
    //time complexity is O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> foundnums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int partner = target - num;

            if (foundnums.containsKey(partner)) {
                return new int[] { foundnums.get(partner), i };
            }

            foundnums.put(num, i);
        }

        return new int[] {};
    }
}


}
