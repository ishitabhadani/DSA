import java.util.Arrays;

public class Bubble_Sort{
    public static void main(String[] args) {
        int[] arr = {12,65,78,2,3,45,9,1,5};
        BubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap arr[j] and arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    static void BubbleSort2(int[] arr) {
        boolean swapped;
        for (int i = arr.length-1; i >= 1; i--) {
            swapped = false;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j+1] < arr[j]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}