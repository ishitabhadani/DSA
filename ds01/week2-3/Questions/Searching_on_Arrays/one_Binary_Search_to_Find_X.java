public class one_Binary_Search_to_Find_X {
    public static void main(String[] args) {
        
    }
    /*
     * class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
     */
    static int BinarySearch_recursion(int[] arr, int key){
        return rec(arr, 0, arr.length-1, key);
    }
    static int rec(int[] arr,int low, int high,int key){
        if (low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid] == key) {
            return mid;
        }
        else if (key>arr[mid]) {
           return rec(arr, mid+1, high, key);
        }
        return rec(arr, low, mid-1, key);
    }

    /*
     * time complexity 
     * O(log (base 2) n)
     */
    //overflow case
    /*
     * if both low and high become int_max then while getting mid we cant use 2INT MAX 
     * so we can write mid=low+(high-low)/2
     */
}