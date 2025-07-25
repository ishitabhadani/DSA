package STRINGS;

public class sixteen_Valid_Palindrome {
    public static void main(String[] args) {
        
    }
    /*
     * 125. Valid Palindrome
Easy
Topics
premium lock icon
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
     */
    //using loops
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if (l != r) return false;

            left++;
            right--;
        }
        return true;
    }

    //using recursion
    public boolean isPalindrome_recur(String s , int left, int right){
        if (left>= right) {
            return true;
        }
        char l = s.charAt(left);
        char r = s.charAt(right);
        if (!Character.isLetterOrDigit(l)) {
            return isPalindrome_recur(s, left+1, right);
        }
        if (!Character.isLetterOrDigit(r)) {
            return isPalindrome_recur(s, left, right-1);
        }
        if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
            return false;
        }
        return isPalindrome_recur(s, left+1, right-1);
    }
}
