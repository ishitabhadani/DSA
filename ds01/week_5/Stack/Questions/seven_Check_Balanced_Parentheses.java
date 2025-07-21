package Stack.Questions;

import java.util.Stack;

public class seven_Check_Balanced_Parentheses {
    /*
     * Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.

Examples :

Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "([]"
Output: False
Explanation: The expression is not balanced as there is a missing ')' at the end.
Input: s = "([{]})"
Output: False
Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
Constraints:
1 ≤ s.size() ≤ 106
s[i] ∈ {'{', '}', '(', ')', '[', ']'}
     */

    public static void main(String[] args) {
        
    }
    
    class Solution {
        static boolean isBalanced(String s) {
            // code here
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);
                if (curr=='(' || curr =='[' || curr=='{') {
                    st.push(curr);
                }
                else{
                    if (st.empty()) {
                        return false;
                    }
                    char ch = st.pop();
                    if (curr==')' && ch !='(' || curr==']' && ch !='[' || curr=='}' && ch !='{'  ) {
                        return false;
                    }
                }
            }
            return st.empty();
        }
    }

}
