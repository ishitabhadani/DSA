package questions;

public class four_Sum_First_N_Natural_Numbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static int sum(int n){
        if (n==0) {
            return 0;
        }
        return n+sum(n-1);
    }
}
