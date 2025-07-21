
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        if (num1%2==0) {
            System.out.println("even number");
        }
        else{
            System.out.println("Odd");
        }    
    }
}
