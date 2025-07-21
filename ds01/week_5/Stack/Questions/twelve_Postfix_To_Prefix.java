package Stack.Questions;

import java.util.Stack;

public class twelve_Postfix_To_Prefix {
    /*Postfix to Prefix Conversion
Difficulty: MediumAccuracy: 76.83%Submissions: 26K+Points: 4Average Time: 30m
You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its prefix form.

Example 1:

Input: 
ABC/-AK/L-*
Output: 
*-A/BC-/AKL
Explanation: 
The above output is its valid prefix form.

Example 2:

Input: 
ab+
Output: 
+ab
Explanation: 
The above output is its valid prefix form.
Your Task:

Complete the function string postToPre(string post_exp), which takes a postfix string as input and returns its prefix form.

Expected Time Complexity: O(post_exp.length()).

Expected Auxiliary Space: O(post_exp.length()).

Constraints:

3<=post_exp.length()<=16000

 */
    public static void main(String[] args) {
        
    }
    // User function Template for Java

    class Solution {
        static String postToPre(String post_exp) {
            Stack<String> st = new Stack<>();
            for (int i = 0; i < post_exp.length(); i++) {
                char ch = post_exp.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    st.push(Character.toString(ch));
                }
                else{
                    String t1 = st.pop();
                    String t2 = st.pop();
                    st.push(ch + t2 + t1);
                }
            }
            return st.peek();
            
        }
    }

}
