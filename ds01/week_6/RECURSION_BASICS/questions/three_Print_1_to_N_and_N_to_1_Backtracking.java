package questions;

public class three_Print_1_to_N_and_N_to_1_Backtracking {
    public static void main(String[] args) {
        print_1ton(10, 10);
        System.out.println();
        print_nto1(10, 10);
    }

    //print 1 to n by backtracking recursion
    static void print_1ton(int i, int n){
        if (i<1) return;
        print_1ton(i-1, n);
        System.out.print(i + "\t");
    }


    //print  by backtracking recursion
    static void print_nto1(int i, int n) {
        if (i < 1) return;
        print_nto1(i - 1, n);
        System.out.print(n - i + 1 + "\t");     
    }





}
