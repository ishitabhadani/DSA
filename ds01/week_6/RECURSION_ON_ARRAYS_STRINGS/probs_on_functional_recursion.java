package RECURSION_ON_ARRAYS_STRINGS;

import java.util.Arrays;

public class probs_on_functional_recursion {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,3,4,0};
        int n = arr.length;
        rev_arr(0, arr, n-1);
        System.out.println(Arrays.toString(arr));
        reverse_array(0, arr, n);
        System.out.println(Arrays.toString(arr));

        String s = "madam";
        String str = "hello";
        System.out.println(palindrome_string(0,s,s.length()));//true
        System.out.println(palindrome_string(0,str,str.length()));//false
    }

    //Q1 : reverse an array
    //use two pointers
    static void rev_arr(int l, int[] arr, int r){

        if (l>=r) {
            return;
        }
        //swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        rev_arr(l+1,arr, r-1);
    }

    //using single pointer
    static void reverse_array(int i, int[] arr, int n){
        if (i>n/2) {
            return;
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse_array(i+1,arr,n);
    }

    //Q2 : check if string is palindrome

    static boolean palindrome_string(int i , String s , int n){
        if (i>=n/2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n-i-1)) {
            return false;
        }
        return palindrome_string(i+1, s, n);
    }


}
