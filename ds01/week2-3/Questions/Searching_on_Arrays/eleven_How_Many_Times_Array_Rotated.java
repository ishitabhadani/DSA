public class eleven_How_Many_Times_Array_Rotated {
    /*
     * Given an integer array nums of size n, sorted in ascending order with distinct values. The array has been right rotated an unknown number of times, between 0 and n-1 (including). Determine the number of rotations performed on the array.
     */
    public static void main(String[] args) {
        
    }
    static int NumberOfRotations(int[] arr){
        int n = arr.length;
        int low =0, high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            //if search space is already sorted
            //then arr[low] will always be smaller
            //so in that search space
            if (arr[low]<=arr[high]) {
                if (arr[low]<ans) {
                    ans = arr[low];
                    index = low;
                }
                break;
            }
            if (arr[low]<=arr[mid]) {
                if (arr[low]<ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else{
                if (arr[mid]<ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
    //application through arraylist
    /*
     * class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int low = 0, high = n - 1;

        while (low <= high) {
            if (nums.get(low) <= nums.get(high)) {
                return low;
            }

            int mid = (low + high) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (nums.get(mid) <= nums.get(prev) && nums.get(mid) <= nums.get(next)) {
                return mid;
            }

            if (nums.get(low) <= nums.get(mid)) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

            return -1; 
        }
}

     */
}
