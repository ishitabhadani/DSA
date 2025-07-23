package questions;

public class one_Print_Something_N_Times {
    
    public static void main(String[] args) {
        String s = "hello";
        print_n_times(s, 4);
    }
    static int count = 0; 
    public static void print_n_times(String s, int n) {
        if (count == n) {
            return;
        }
        System.out.println(s); // Print first
        count++; // Increment count
        print_n_times(s, n);  // Recursive call
    }
}
