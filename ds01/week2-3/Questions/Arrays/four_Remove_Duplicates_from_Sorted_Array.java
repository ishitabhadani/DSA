import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class four_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3};
        RemoveDuplicates(nums);

    }
    //brute solution: time complexity=NlogN+N and space complexity O(N)
    static int RemoveDuplicates(int[] arr){
        Set<Integer> Uniques = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Uniques.add(arr[i]); //this loop is NlogN time
        }
        int index = 0;
        for (Integer integer : Uniques) {
            arr[index] = integer;//this loop needs N time
            index++;
        }
        return (index+1);
    }
    //now apply 2 pointer approach and then get optimal approach
    //Time-O(N) Space-O(1)
    static int RemoveDuplicates2(int[] arr){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                 arr[i+1] = arr[j];
                 i++;               
            }
        }
        return (i+1);
    }
}
