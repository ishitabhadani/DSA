import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        //find nth fibonacci number
        int a=0,b=1,count=2;
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        while (count<=n) {
            int temp=b;
            b = b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
