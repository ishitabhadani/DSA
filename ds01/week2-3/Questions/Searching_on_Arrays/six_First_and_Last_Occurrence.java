public class six_First_and_Last_Occurrence {
    /*
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.


     */
    public static void main(String[] args) {
        
    }
    static int[] CheckOccurance_LS(int[] arr, int x){
        int n = arr.length;
        int first=-1,last=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x) {
                if (first==-1) {
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first,last};
    }

    //using lower bound and upper bound concepts from before
    /*
     * time - 2O(log(base2)N)
     * space - O(1)
     */
    static int[] CheckOccurance_LB_UB(int[] arr,int n, int k){
        int lb = LowerBound(arr, n, k);
        
        if (lb==n || arr[lb] != k) {
            return new int[]{-1,-1};
        }
        return new int[]{lb,UpperBound(arr, n, k)-1};
    }

    static int LowerBound(int[] arr, int n,int x){
        
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
    static int UpperBound(int[] arr,int n, int x){
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

    // using normal binary search
    static int[] CheckOccurance_BS(int[] arr , int n , int x){
       
       int first = first_occurance(arr, n, x);
       if (first == -1) {
        return new int[]{-1,-1};
       }
       int last = last_Occurance(arr, n, x);
       return new int[]{first,last};
    }
    static int first_occurance(int[] arr, int n, int x){
        int first = -1;
        int low = 0, high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==x) {
                first = mid;high = mid -1;
            }
            else if (arr[mid]<x) {
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    static int last_Occurance(int[] arr, int n , int x){
        int last = -1;
        int low = 0, high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid]<x) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;

    }
}
