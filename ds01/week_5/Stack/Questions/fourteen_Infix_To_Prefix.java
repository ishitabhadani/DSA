package Stack.Questions;

import java.util.Stack;

public class fourteen_Infix_To_Prefix {
    /*
     * Infix to Prefix Conversion


0

100
Given a valid arithmetic expression in infix notation, return its equivalent prefix (Polish) notation.



The expression can contain:

lowercase letters a–z as operands,
the four binary operators + - * /,
and round parentheses ( ) that enforce evaluation order.
No whitespace appears in the input.


The input is guaranteed to be syntactically correct (parentheses are balanced, every operator has two operands, etc.).


Examples:
Input: "(a+b)*c"

Output: "*+abc"

Explanation:

 Infix  : (a + b) * c
 Prefix : * + a b c
Input: "a+b*c"

Output: "+a*bc"

Explanation:

 Infix : a + (b * c)
 Prefix : + a * b c
     */
    public static void main(String[] args) {
        
    }
    class Solution {
        /*
         * 1. reverse the infix string
         * convert closing bracket to opening and vice versa
         * infix to postfix 
         * reverse the postfix found which will be prefix of given expression
         */
        public String infixToPrefix(String s) {
            s = reverse(s);
            StringBuilder ans = new StringBuilder();
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isLetter(ch)) {
                    ans.append(ch);
                } else if (ch == '(') {
                    st.push(ch);
                } else if (ch == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        ans.append(st.pop());
                    }
                    if (!st.isEmpty()) st.pop(); 
                } else { 
                    while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                        ans.append(st.pop());
                    }
                    st.push(ch);
                }
            }

            while (!st.isEmpty()) {
                ans.append(st.pop());
            }

            return ans.reverse().toString();
        }
        public static String reverse(String s) {
            StringBuilder str = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);

                if (ch == '(') {
                    str.append(')');
                } else if (ch == ')') {
                    str.append('(');
                } else {
                    str.append(ch);
                }
            }

            return str.toString();
        }
        private static int priority(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }
}
}
