package RECURSION_ON_NUMBERS_COMBINATORICS;

public class multiple_recursion_calls {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    
    //Q1 : print nth fibonacci number
    //time complexity - 2^n - expotential since theres 2 calls 2 if there was 3 it would be 3^n
    //not exactly to the power n but near about it
    static int fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
