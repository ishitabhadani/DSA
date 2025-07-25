package RECURSION_ON_NUMBERS_COMBINATORICS.questions;

public class nine_Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    //Factorial of a Number using Recursion
    static int fact(int n){
        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
}
