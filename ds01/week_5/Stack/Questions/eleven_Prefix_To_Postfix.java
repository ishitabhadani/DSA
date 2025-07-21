package Stack.Questions;

import java.util.Stack;

public class eleven_Prefix_To_Postfix {
    /*
     * Prefix to Postfix Conversion
Difficulty: MediumAccuracy: 75.66%Submissions: 26K+Points: 4Average Time: 30m
You are given a string that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

Example:

Input: 
*-A/BC-/AKL
Output: 
ABC/-AK/L-*
Explanation: 
The above output is its valid postfix form.
Your Task:

Complete the function preToPost(string pre_exp), which takes a prefix string as input and returns its postfix form.

 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=pre_exp.length()<=100


     */
    public static void main(String[] args) {
        
    }
    // User function Template for Java

    class Solution {
        static String preToPost(String pre_exp) {
            Stack<String> st = new Stack<>();
        
            for (int i = pre_exp.length() - 1; i >= 0; i--) {
                char ch = pre_exp.charAt(i);
                
                if (Character.isLetterOrDigit(ch)) {
                    st.push(Character.toString(ch));  
                } else {
                    String t1 = st.pop();
                    String t2 = st.pop();
                    String s = t1 + t2 + ch;
                    st.push(s);
                }
            }
            
            return st.peek(); 
        }
    }

}
