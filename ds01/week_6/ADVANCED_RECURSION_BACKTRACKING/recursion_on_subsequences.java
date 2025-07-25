package ADVANCED_RECURSION_BACKTRACKING;

import java.util.ArrayList;

public class recursion_on_subsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<Integer>();
        arr_subsequence(list, arr, 0, arr.length);
    }
    
    /*
     * subsequence - contiguous/ non - contiguous sequences, with follow the order
     * example:
     * arr= {3,1,2} the subsequences can be:
     * {} , {3} , {1} , {2} , {3,1} , {1,2} , {3,2} , {3,1,2}
     * other than {3,2} all others are also sub arrays
     */
    static void arr_subsequence(ArrayList<Integer> list, int[] arr, int index, int n){
        if (index>=n) {
            System.out.println(list.toString());
            return;
        }
        list.add(arr[index]);
        arr_subsequence(list, arr, index+1, n);
        list.removeLast();
        arr_subsequence(list, arr, index+1, n);

    }

}
