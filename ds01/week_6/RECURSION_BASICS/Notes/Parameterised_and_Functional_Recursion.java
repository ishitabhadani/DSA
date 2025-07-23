package Notes;

public class Parameterised_and_Functional_Recursion {
    public static void main(String[] args) {
        System.out.println(fact(4));

    }

    //Q1 : sum of first n numbers 

    //using parameterised way
    static void sum_till_i(int i, int sum){
        if (i<1) {
            System.err.println(sum);
            return;
        }
        sum_till_i(i-1, sum+i);
    }

    //using functional way
    static int sum_till_num(int num){
        if (num==0) {
            return 0;
        }
        return num+sum_till_num(num-1);
    }

    //Q3 : factorial of n 
    static int fact(int n){
        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
}
