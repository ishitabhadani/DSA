public class four_Search_Insert_Position {
    /*
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.


     */
    public static void main(String[] args) {
        
    }
    /*
     * class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low=0,high=n-1;
        int ans = n;
        while (low<=high) {
            int mid=(low+high)/2;
            if (nums[mid]>=target) {
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
     */
    static int SearchPosition(int[] arr, int x){
        int n = arr.length;
        int low=0,high=n-1;
        int ans = n;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]>=x) {
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
