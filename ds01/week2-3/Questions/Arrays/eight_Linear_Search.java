public class eight_Linear_Search {
    public static void main(String[] args) {
        
    }
//     import java.util.*;
// public class Solution {
//     public static int linearSearch(int n, int num, int[] arr){
//         for(int i=0; i<n ; i++){
//             if(arr[i]==num){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
    static int linearSearch(int n, int num, int[] arr){
        for(int i=0; i<n ; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
