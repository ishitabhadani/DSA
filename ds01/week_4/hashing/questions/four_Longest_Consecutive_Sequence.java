import java.util.HashSet;
import java.util.Set;

public class four_Longest_Consecutive_Sequence {
    /*
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]
     */
    class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int ans = 1;
        for (int n : set) {
            if (set.contains(n-1)) continue;
            int cursor = n;
            int temp = 1;
            while (set.contains(cursor+1)) {
                cursor += 1;
                temp += 1;
            }
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}
}
