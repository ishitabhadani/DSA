package ADVANCED_RECURSION_BACKTRACKING.questions;

public class thirteen_Print_All_Subsequences {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String s = "hello";
        str_sub(s, str, 0, s.length());
    }
    //Print All Subsequences of a String
    static void str_sub(String s, StringBuilder temp , int index, int n){
        if (index >= n) {
            System.out.println(temp.toString());
            return;
        }

        temp.append(s.charAt(index));
        str_sub(s, temp, index+1, n);
        temp.deleteCharAt(temp.length()-1);
        str_sub(s, temp, index+1, n);
    }
}
