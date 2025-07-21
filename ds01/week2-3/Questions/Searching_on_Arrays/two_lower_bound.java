public class two_lower_bound {
    /*
     * You are given an array 'arr' sorted in non-decreasing order and a number 'x'. 
     * You must return the index of the lower bound of 'x'.
    Note:
    1. For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' 
    such that the value 'arr[idx]' is not less than 'x'.If all numbers are smaller than 'x', 
    then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
     */
    public static void main(String[] args) {
        
    }
    /* 
     * time - O(log(base2)N)
     * space - O(1)
     */
    static int LowerBound_BS(int[] arr, int x){
        int n = arr.length;
        int low=0,high=n-1;
        int ans = n;
        while (low<=high) {
            int mid=(low+high)/2;
            //maybe an answer
            if (arr[mid]>=x) {
                ans = mid;
                high = mid-1; //look for smaller index on left
            }
            else{
                low=mid+1; //look in right
            }
        }
        return ans;
    }
}
