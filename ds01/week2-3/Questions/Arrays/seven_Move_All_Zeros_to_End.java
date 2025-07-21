import java.util.Arrays;

public class seven_Move_All_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr = {1,5,0,4,0,2,6,8,0,4,7,9,0,3,0,4,0,4,0};
        MoveZeros(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    /*class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int j = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    j=i;  
                    break;              
                }
            }
            if(j!=-1){
                for (int i = j+1; i < n;i++){
                    if (nums[i] != 0) {
                        //swap 
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        j++;
                    }
                }
            }
        }
    } */
    //brute
    //time- O(2N) space- O(x) where x is number of non-zeros(worst case O(N))
    static void MoveZeros(int[] arr, int n){
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }

        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }
    }
    //time - O(N) , Space - O(1)
    static void moveZeros(int[] arr, int n){
        int j=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j=i;  
                break;              
            }
        }
        for (int i = j+1; i < n; i++) {
            if (arr[i] != 0) {
                //swap 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
