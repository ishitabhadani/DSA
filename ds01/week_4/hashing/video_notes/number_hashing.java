import java.util.Scanner;

public class number_hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements in array");
        int n = in.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] hash = new int[13]; //assuming elements of array till 12
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        
        int choice = 0;
        while (true) {
            System.out.println("1. give query \n 2.end program");
            choice = in.nextInt();
            if (choice == 2) {
                break;
            }
            System.out.println("give query");
            int query = in.nextInt();
            System.out.println(hash[query]);
        }
    }
}
