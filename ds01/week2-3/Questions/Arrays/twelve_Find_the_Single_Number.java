import java.util.HashMap;
import java.util.Map;

public class twelve_Find_the_Single_Number {
    public static void main(String[] args) {
        System.out.println((int)(11/2+1));
    }
    /*
     *class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            int key = nums[i];
            int count=0;
            for(int j=0; j<n ; j++){
                if(nums[j]==key){
                    count++;
                }
            }
            if(count == 1){
                return key;
            }
        }
        return -1;
    }
}
     */
    //Brute approach
    static int singleNumber(int[] arr) {
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int num = arr[i];
            int cnt=0;
            for(int j=0; j<n ; j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt == 1){
                return num;
            }
        }
        return -1;
    }

    //better solution - hashing - only valid for all positive number array will throw error if array contains negative numbers
    static int singleNumber_Hashing(int[] arr){
        int maxi = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int[] hash = new int[maxi];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]]==1) {
                return arr[i];
            }
        }
        return -1;
    }
    //to handle the negative numbers as well we use maps
    /* 
     * Time - O(Nlog(N/2+1)+O(N/2)+1)
     * space - O(N/2+1)
    */
    public static int singleNumber_ByMapping(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (mpp.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1;
    }
    //optimal
    static int singleNumber_ByXOR(int[] arr){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
        }
        return xor;
    }

}
