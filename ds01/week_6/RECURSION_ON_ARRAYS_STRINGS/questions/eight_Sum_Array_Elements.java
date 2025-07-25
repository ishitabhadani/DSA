package RECURSION_ON_ARRAYS_STRINGS.questions;

public class eight_Sum_Array_Elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumArr(arr, 0));
    }
    //Sum of Array Elements using Recursion
    static int sumArr(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sumArr(arr, i + 1);
    }

}
