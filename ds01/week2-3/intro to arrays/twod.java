import java.util.Arrays;
import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // //declare without input giving atleast rows is cumpolsury columns are optional
        // int[][] arr = new int[3][];


        // //decalre with values: giving no index is neccesary
        // int[][] arr2D  = {
        //     {1,2,3},    //0th index
        //     {4,5},    //1st index
        //     {6,7,8,9}   //2nd index
        // };

        int[][] arrin = new int[3][3];    
        System.out.println(arrin.length); //no of rows

        // input into 2D array
        for (int row = 0; row < arrin.length; row++) {
            //for each col in every row
            for (int col = 0; col < arrin[row].length; col++) {
                arrin[row][col] = in.nextInt();
            }
        }

        //printing using 2 loops
        for (int row = 0; row < arrin.length; row++) {
            //for each col in every row
            for (int col = 0; col < arrin[row].length; col++) {
                System.out.print(arrin[row][col] + " ");
            }
            System.out.println();
        }

        //priting using toString method
        for (int row = 0; row < arrin.length; row++) {
            System.out.println(Arrays.toString(arrin[row]));
        }
        
        //using enhanced for loop
        for (int[] /*datatype of each element here it is an array i.e each row*/ a : arrin) {
            System.out.println(Arrays.toString(a));
        }
    
    
    }
}
