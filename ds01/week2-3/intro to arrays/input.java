import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int arr[] = new int[5];
        // //input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=in.nextInt();
        // }
        
        // //converting to string and printing
        // System.out.print(Arrays.toString(arr));

        // //print using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // //special for 
        // for(int num : arr){// here num is element of the array
        //     System.out.print(num+", ");
        // }


        //arr of objs
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        //printing
        System.out.println(Arrays.toString(str));


    }
}
