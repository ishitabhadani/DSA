package ADVANCED_RECURSION_BACKTRACKING.questions;


public class fourteen_Generate_Balanced_Parentheses {
    static boolean found = false;
    public static void main(String[] args) {
        generate_balanced("(*)*())(", 0, 0, "");
        if (!found) {
            System.out.println("cant balance");
        }
    }
    //Generate Balanced Parentheses

    static void generate_balanced(String s, int ind, int bal, String cur) {
        if (bal < 0) return;
        if (ind == s.length()) {
            if (bal == 0) {
                System.out.println(cur);
                found = true;
            }
            return;
        }
        char ch = s.charAt(ind);
        if (ch == '(') {
            generate_balanced(s, ind + 1, bal + 1, cur + '(');
        } else if (ch == ')') {
            generate_balanced(s, ind + 1, bal - 1, cur + ')');
        } else if (ch == '*') {
            generate_balanced(s, ind + 1, bal, cur);
            generate_balanced(s, ind + 1, bal + 1, cur + '(');
            generate_balanced(s, ind + 1, bal - 1, cur + ')');
        }
    }

}
