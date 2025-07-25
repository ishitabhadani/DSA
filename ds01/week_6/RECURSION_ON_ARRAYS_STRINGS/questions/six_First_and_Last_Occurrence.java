package RECURSION_ON_ARRAYS_STRINGS.questions;

import java.util.Arrays;

public class six_First_and_Last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,3,7,9,2,4,5,0};
        int n = arr.length;
        System.out.println("first" + first(arr, 0, 7, n));
        System.out.println("last" + last(arr, n-1, 7, n));

        int[] ans = {-1,-1};
        first_and_last_Occurrence(arr, 0, 7, n, ans);
        System.out.println(Arrays.toString(ans));
    }
    //Find First and Last Occurrence of an Element in Array using Recursion


    //first occurance
    //time - O(N)
    static int first(int[] arr, int i, int key, int n){
        if (i==n) {
            return -1; //if not found 
        }

        if (arr[i] == key) {
            return i; //if found we give the index of that
        }

        return first(arr, i+1, key, n);
    }

    //last occurance
    //time - O(N)
    static int last(int[] arr, int i, int key, int n){
        if (i<0) {
            return -1; //reached the start and we couldnt find
        }

        if (arr[i] == key) {
            return i;
        }

        return last(arr, i-1, key, n);
    }

    //combined function that does both
    //time - O(N)
    static void first_and_last_Occurrence(int[] arr, int i , int key ,int n, int[] ans){
        if (i==n) {
            return;
        }
        if (arr[i] == key) {
            if (ans[0] == -1) {
                ans[0] = i;
            }
            ans[1] = i;
        }

        first_and_last_Occurrence(arr, i+1, key, n, ans);
    }
}
