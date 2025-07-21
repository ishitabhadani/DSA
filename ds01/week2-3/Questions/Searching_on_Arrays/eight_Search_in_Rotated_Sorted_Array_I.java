public class eight_Search_in_Rotated_Sorted_Array_I {
    /*
     * There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.


     */
    public static void main(String[] args) {
        
    }
    //we can use linear search but time complexity O(N)
    //so we will use binary search 
    //log(base2)N
    static int RotatedSortedSearch(int[] arr, int n , int x){
        int low =0, high =n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==x) {
                return mid;
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
        return -1;
    }
}
