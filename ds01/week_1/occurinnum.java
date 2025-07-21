import java.util.Scanner;
public class occurinnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number from where to search");
        int n= in.nextInt();
        System.out.println("enter number to search");
        int key = in.nextInt();
        int count=0;
        while (n>0) {
            int rem=n%10;
            if (rem==key) {
                count++;
            }
            n=n/10;
        }
        System.out.println("the digit "+key+" occurs "+count+" times");
    }
}
