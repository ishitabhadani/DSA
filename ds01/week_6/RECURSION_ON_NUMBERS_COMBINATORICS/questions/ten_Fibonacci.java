package RECURSION_ON_NUMBERS_COMBINATORICS.questions;

public class ten_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib(7));
    }

    //Fibonacci Number using Recursion
    static int fib(int n){
        if (n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
