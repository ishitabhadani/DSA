public class twelve_Single_Element_in_Sorted_Array {
    /*
     * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
     */
    public static void main(String[] args) {
        
    }
    //time - O(N)
    static int Single_Occur_LS(int[] arr){
        int n = arr.length;
        if (n==1) {
            return arr[0];
        }
        for (int i = 0; i < n; i++) {
            
            if (i==0) {
                if (arr[i] != arr[i+1]) {
                    return arr[i];
                }
                
            } 
            else if (i==n-1) {
                if (arr[i] != arr[i-1]) {
                    return arr[i];
                }
            }
            else {
                if (arr[i] != arr[i+1] && arr[i] != arr[i-1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    //apply binary search
    /*
         * for example take array [1,1,2,2,3,3,4,5,5,6,6]
         *                indexing[0,1,2,3,4,5,6,7,8,9,10]
         * so for each pair of indexes
         * (even,odd) - element is on right half
         * (odd,even) - element on left half
         * 
         */  
        //time log(base2)N
    static int Single_Occur_BS(int[] arr, int n){
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // single element must be on right
            else if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } 
            // Single element is on the left
            else {
                high = mid - 1;
            }
        }

        return -1; // just to complete return function will never reach here
    }
}
