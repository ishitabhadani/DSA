public class seven_Count_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println(count_BS(arr ,target));
    }
    //using linear search 
    static int count_LS(int[] arr, int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++;
            }
        }
        return count;
    }
    //its basically upper bound - lower bound 
    static int count_BS(int[] arr, int x){
        int n = arr.length;
        return UpperBound(arr, n, x) - LowerBound(arr,n,x);
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
    
}
