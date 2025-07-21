import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID= in.nextInt();
        String dept = in.next();
        switch(empID){
            case 1 -> System.out.println("Ishita");
            case 2 -> System.out.println("Prisha");
            case 3 -> {
                System.out.println("emp 3");
                switch(dept){
                    case "IT"->System.out.println("IT");
                    case "Management"-> System.out.println("Management");
                    default-> System.out.println("no valid dept entered");
                }
            }
            default -> System.out.println("enter valid id");
            }
        }
}
