import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {12,65,78,2,3,45,9,1,5};
        InsertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));    }
    static void InsertionSort(int[] arr, int n){
        for (int index = 0; index < n; index++) {
            int j = index;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;              
            }
        }  
    }
}
