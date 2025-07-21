package Stack.Questions;

import java.util.Stack;

public class ten_Prefix_To_Infix {
    /*
     * You are given a string S of size N that represents the prefix form of a valid mathematical expression. The string S contains only lowercase and uppercase alphabets as operands and the operators are +, -, *, /, %, and ^.Convert it to its infix form.

Example 1:

Input: 
*-A/BC-/AKL
Output: 
((A-(B/C))*((A/K)-L))
Explanation: 
The above output is its valid infix form.
Your Task:

Your task is to complete the function string preToInfix(string pre_exp), which takes a prefix string as input and return its infix form.

Expected Time Complexity: O(N).

Expected Auxiliary Space: O(N).

Constraints:

3<=|S|<=104


     */
    public static void main(String[] args) {
        
    }
    // User function Template for Java

    class Solution {
        static String preToInfix(String pre_exp) {
            Stack<String> st = new Stack<>();
            for (int i = pre_exp.length()-1; i >= 0; i--) {
                char ch = pre_exp.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    st.push(Character.toString(ch));
                }
                else{
                    String t1 = st.pop();
                    String t2 = st.pop();
                    String s = '(' + t1 + ch + t2 + ')';
                    st.push(s);
                }
            }
            return st.peek();
        }
    }
}
