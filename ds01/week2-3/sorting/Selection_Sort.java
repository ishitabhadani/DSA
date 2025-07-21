import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {12,65,78,2,3,45,9,1,5};
        SelectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr, int n){
        for (int i = 0; i < n-2; i++) {
            int min = i;
            for (int j = i; j <= n-1; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }



}