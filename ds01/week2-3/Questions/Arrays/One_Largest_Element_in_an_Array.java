import java.util.* ;
import java.io.*; 

public class One_Largest_Element_in_an_Array {

    static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for(int i=0 ; i<n ; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
}