public class ten_Find_Minimum_in_Rotated_Sorted_Array {
    /*
     * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.


     */
    public static void main(String[] args) {
        
    }
    //brute
    //linear search - O(N)

    //better
    //sorted half may or may not have the answer so take min from dorted and eleminate
    static int Min_IN_Rotated(int[] arr, int n){
        int low =0, high = n-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[low]<=arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    //optimal
    //time - O(log(base2)N)
    static int Min_IN_Rotated_Final(int[] arr, int n){
        int low =0, high = n-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high) {
            int mid = (low+high)/2;
            //if search space is already sorted
            //then arr[low] will always be smaller
            //so in that search space
            if (arr[low]<=arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }
            if (arr[low]<=arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

}
