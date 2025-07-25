package RECURSION_ON_ARRAYS_STRINGS.questions;

public class five_Check_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1,3,4,5,2};
        int n = arr.length;
        int n2= arr2.length;
        System.out.println(sorted_arr(arr, 0, n));
        System.out.println(sorted_arr(arr2, 0, n2));
        
    }

    static boolean sorted_arr(int[] arr, int i, int n){
        if (i==n-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return sorted_arr(arr, i+1, n);
    }
}
