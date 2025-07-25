package RECURSION_ON_NUMBERS_COMBINATORICS.questions;

public class eleven_Power_of_Number {
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
        System.out.println(power(2, -2));
        System.out.println(half_power(4, 4));
    }

    //Power of a Number using Recursion

    //this is applicable for only positive integer numbers and powers
    static int pow(int n , int p){
        if (p==0) {
            return 1;
        }
        return n*pow(n, p-1);
    }

    //for negavtive as well as floating n
    static float power(float n , float p){
        if (p==0) {
            return 1;
        }

        if (p<0) {
            return (float) (1.0/power(n, -p));
        }
        return n * power(n, p-1);
    }
    
    //dividing power to half and then expotentiating
    static double half_power(double n, int p) {
        if (p == 0){
            return 1;
        }
        if (p < 0){
            return 1 / half_power(n, -p);
        }
        double half = half_power(n, p / 2);
        if (p % 2 == 0) {
            return half * half;
        } else {
            return n * half * half;
        }
    }

}
