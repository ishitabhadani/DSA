package Stack.Questions;

import java.util.Stack;

public class thirteen_Postfix_To_Infix {
    
    /*
     * You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its infix form.

Example:

Input:
ab*c+ 
Output: 
((a*b)+c)
Explanation: 
The above output is its valid infix form.
Your Task:

Complete the function string postToInfix(string post_exp), which takes a postfix string as input and returns its infix form.

 

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=post_exp.length()<=104
     */
    public static void main(String[] args) {
        
    }

    class Solution {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                st.push(Character.toString(ch));
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String s = '(' + t2 + ch + t1 + ')';
                st.push(s);
            }

        }
        return st.peek();
    }
}
}
