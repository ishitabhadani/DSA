package RECURSION_ON_NUMBERS_COMBINATORICS.questions;

public class twelve_Count_Digits {
    public static void main(String[] args) {
        System.out.println(count_digits(5597));
        System.out.println(count_dig(74857));
    }
    //Count Digits of a Number using Recursion
    //time & space - O(number of digits) = O(log(base 10)N)
    public static int count_digits(int n) {
        if (n == 0){
            return 0;
        }
        return 1 + count_digits(n / 10);
    }

    //if not recursion better way to solve
    public static int count_dig(int n){
        int digits = (int) (Math.log10(n)+1);
        return digits;
    }
}
