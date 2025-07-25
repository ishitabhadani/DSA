package ADVANCED_RECURSION_BACKTRACKING;

public class valid_paranthesis_string {
    public static void main(String[] args) {
        String s = "(()*)";
        System.out.println(check(s, s.length()));
    }
    /*
     * s=() - valid
     * s=(*) - valid
     * s=(*)) - invalid - * to ( then (()) - valid
     * s= (**( - invalid - cant be made valid in any case
     */

    //time - 3^n , space - O(N)
    static boolean check_valid_parathesis(String s, int index, int count,int n){
        if (count<0) {
            return false;
        }
        if (index==n) {
           return count==0; 
        }
        if (s.charAt(index) == '(') {
            return check_valid_parathesis(s, index+1, count+1, n);
        }
        if (s.charAt(index) == ')') {
            return check_valid_parathesis(s, index+1, count-1, n);
        }
        return (check_valid_parathesis(s, index+1, count+1, n) || 
                check_valid_parathesis(s, index+1, count-1, n) || 
                check_valid_parathesis(s, index+1, count, n));
    }

    static boolean check(String s,int n){
        int min=0,max=0;
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case '(':
                    min++;
                    max++;
                    break;
                case ')':
                    min--;
                    max--;
                    break;
                default:
                    min--;
                    max++;
                    break;
            }
            if (min<0) {
                min=0;
            }
            if (max<0) {
                return false;
            }
        }
    return min==0;
    }
}
