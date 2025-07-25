package STRINGS;

public class fifteen_Reverse_String {
    public static void main(String[] args) {
        
    }
    /*
     * 
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
     */

    //using recursion
    public void reverseString(char[] s) {
        rev_str(s, 0, s.length - 1);
    }
    static void rev_str(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        rev_str(s, left + 1, right - 1);
    }

    //better solution
    //using double pointer and loops
    public void reverseString_optimised(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
