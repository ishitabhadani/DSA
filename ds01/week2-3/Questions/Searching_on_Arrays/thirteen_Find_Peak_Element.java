public class thirteen_Find_Peak_Element {
    /*A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time. */
    public static void main(String[] args) {
        
    }
    //time- O(N) space - O(1)
    static int peak_LS(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i==0 || arr[i-1]<arr[i])&&(i==n-1 || arr[i]>arr[i+1])) {
                return i;
            }
        }
        return -1;
    }

    //using binary search 
    //
    static int peak_BS(int[] arr, int n){
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if (arr[n-1]>arr[n-2]) {
            return n-1;
        }
        int low=1,high=n-2;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if (arr[mid] > arr[mid-1]) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
