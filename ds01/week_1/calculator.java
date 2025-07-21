import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.println("enter operator or X to stop");
            char op=iScanner.next().trim().charAt(0); 
                if (op=='+'||op=='-'||op=='/'||op=='*'||op=='%') {
                        System.out.println("enter 2 numbers");
                        int num1=iScanner.nextInt();
                        int num2=iScanner.nextInt();
                        if (op=='/') {
                            if (num2!=0) {
                                ans=num1/ num2;
                            }
                        }
                        if (op=='+') {
                            ans=num1+num2;
                            
                        }        
                        if (op=='-') {
                            ans=num1- num2;
                            
                        }
                        if (op=='*') {
                            ans=num1* num2;
                            
                        }
                        if (op=='%') {
                            ans=num1% num2;
                            
                        }
                        System.out.println("answer"+ans);
                    } 
                else if (op=='x'||op=='X') {
                    break;
                }
                else{
                    System.out.println("Invalid Operation");
                }
        }           
        
    }
}

