package questions;

public class two_Print_N_to_1 {
    public static void main(String[] args) {
       print_nto1(10, 10);
    }


    //print n to 1 
    static void print_nto1(int i, int n){
        if (i<1) {
            return;
        }
        System.out.print(i + "\t");
        print_nto1(i-1, n);
    }
}
