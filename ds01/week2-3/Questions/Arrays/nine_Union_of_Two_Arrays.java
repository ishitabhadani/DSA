import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nine_Union_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,7};
        int[] arr = Union2pointer(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
//     class Solution {
//     public int[] unionArray(int[] nums1, int[] nums2) {
//         Set<Integer> Union_Set = new HashSet<>();
//         for (int i = 0; i < nums1.length; i++) {
//             Union_Set.add(nums1[i]);
//         }
//         for (int i = 0; i < nums2.length; i++) {
//             Union_Set.add(nums2[i]);
//         }
//         int n = Union_Set.size();
//         int[] Union = new int[n];
//         int i=0;
//         for(int iterator : Union_Set){
//             Union[i++]=iterator;
//         }
//         return Union;
//     }
// }
    /*
     * Worst case time and space 
     Time - O(n1logn+n2logn)+O(n1+n2)
     Space - O(n1+n2)+O(n1+n2) //the second n1+n2 is being used to return the answer only and not to solve
     */
    static int[] Union(int[] arr1, int[] arr2){
        Set<Integer> Union_Set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            Union_Set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            Union_Set.add(arr2[i]);
        }
        int n = Union_Set.size();
        int[] Union = new int[n];
        int i=0;
        for(int iterator : Union_Set){
            Union[i++]=iterator;
        }
        return Union;
    }
    //using 2 pointer approach
    /*
     * Time - O(n1+n2)
     * Space - O(n1+n2) used only to return the answer not to solve
     */
    static int[] Union2pointer(int[] a, int[] b){
        ArrayList<Integer> Temp = new ArrayList<>();
        int n1= a.length, n2=b.length;
        int i=0,j=0;
        while (i<n1 && j<n2) {
            if (a[i] <= b[j]) {
                if (Temp.size()==0 || Temp.getLast() != a[i]) {
                    Temp.add(a[i]);
                }
                i++;
            }
            else{
                if (Temp.size()==0 || Temp.getLast() != b[j]) {
                    Temp.add(b[j]);
                }
                j++;
            }
        }
        while (j<n2) {
                if (Temp.size()==0 || Temp.getLast() != b[j]) {
                    Temp.add(b[j]);
                }
                j++;                
        }
        while (i<n1) {
                if (Temp.size()==0 || Temp.getLast() != a[i]) {
                    Temp.add(a[i]);
                }
                i++;
        }
        int[] Union = new int[Temp.size()];
        for (int k = 0; k < Union.length; k++) {
            Union[k] = Temp.get(k);
        }
        return Union;
    }
    
}
