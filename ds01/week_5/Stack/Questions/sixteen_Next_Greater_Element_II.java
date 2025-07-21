package Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class sixteen_Next_Greater_Element_II {
    /*
     * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
 

Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109
     */

    public static void main(String[] args) {
        
    }
    class Solution {
        //brute force
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] nge = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < i + n - 1; j++) {
                    int index = j % n;
                    if (nums[index] > nums[i]) {
                        nge[i] = nums[index];
                        break;
                    }
                }
            }
            return nge;
        }

        //optimized 
        public int[] nextGreaterElements1(int[] nums) {
            int n = nums.length;
            int[] nge = new int[n];
            Arrays.fill(nge, -1); 
            Stack<Integer> st = new Stack<>(); 
            for (int i = 0; i < 2 * n; i++) {
                int curr = i % n;

                while (!st.isEmpty() && nums[curr] > nums[st.peek()]) {
                    int index = st.pop();
                    nge[index] = nums[curr];
                }

                if (i < n) {
                    st.push(curr);
                }
            }

            return nge;
        }


    }
}
