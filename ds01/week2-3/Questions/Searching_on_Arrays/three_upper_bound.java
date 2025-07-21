public class three_upper_bound {
    /*
     * Problem statement
    You are given a sorted array ‘arr’ containing ‘n’ integers 
    and an integer ‘x’.Implement the ‘upper bound’ function to 
    find the index of the upper bound of 'x' in the array.
    Note:
    1. The upper bound in a sorted array is the index of the 
       first value that is greater than a given value. 
    2. If the greater value does not exist then the answer is 'n', 
       Where 'n' is the size of the array.
    3. Try to write a solution that runs in log(n) time complexity.
    */
    public static void main(String[] args) {
        
    }
    static int UpperBound_BS(int[] arr, int x){
        int n = arr.length;
        int low=0,high=n-1;
        int ans = n;

        while (low<=high) {
            int mid=(low+high)/2;
            //maybe an answer
            if (arr[mid]>x) {
                ans = mid;
                //look for more small index on left
                high = mid-1;
            }
            //look on right
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
