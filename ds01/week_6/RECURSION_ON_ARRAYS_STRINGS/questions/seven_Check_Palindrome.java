package RECURSION_ON_ARRAYS_STRINGS.questions;

public class seven_Check_Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String str = "hello";
        System.out.println(palindrome_string(0,s,s.length()));
        System.out.println(palindrome_string(0,str,str.length()));
    
    }
    //Check Palindrome using Recursion
    //time - O(N/2)
    //space - O(N/2)
    static boolean palindrome_string(int i , String s , int n){
        if (i>=n/2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n-i-1)) {
            return false;
        }
        return palindrome_string(i+1, s, n);
    }
}
