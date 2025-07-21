package Notes;

public class probs_on_recursion {
    public static void main(String[] args) {
        print_till_n(1, 10);
    }

    //Q1 : print name n times using recursion
    static void print_name(int i, int n){
        if (i>n) { //base case
            return; 
        }
        System.out.print("ishita\t");
        print_name(i+1, n); //increasing i 
    }

    //Q2 : print 1 to n linearlly
    static void print_till_n(int i, int n){
        if (i>n) {
            return;
        }
        System.out.print(i + "\t");
        print_till_n(i+1, n);
    }
    
    //Q3 : print numbers from n to 1 
    static void print_nto1(int i, int n){
        if (i<1) {
            return;
        }
        System.out.print(i + "\t");
        print_nto1(i-1, n);
    }

    //Q4 : print 1 to n using backtrack
    static void print_1ton_backtrack(int i, int n){
        if (i<1) {
            return;
        }
        print_1ton_backtrack(i-1, n);
        System.out.println(i);
    }
}
