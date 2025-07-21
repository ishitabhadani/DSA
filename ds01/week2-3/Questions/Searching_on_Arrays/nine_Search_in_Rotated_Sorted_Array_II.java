public class nine_Search_in_Rotated_Sorted_Array_II {
    /*
     * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.
     */
    public static void main(String[] args) {
        
    }
    /*
     * time - O(log(base2)N) or in worst possible case O(n/2)
     */
    static boolean RotatedDuplicatesSearch(int[] arr, int n , int x){
        int low =0, high =n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==x) {
                return true;
            }
            if (arr[low]==arr[mid] && arr[high]==arr[mid]) {
                low++;high--;
                continue;
            }
            //left half sorted
            if(arr[low]<=arr[mid]){
                if (arr[low]<=x && x <= arr[mid]) {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right half sorted
            else{
                if (arr[mid]<= x && x <= arr[high]) {
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
