public class five_Floor_and_Ceil {
    /*
     * Given a sorted array nums and an integer x. 
     * Find the floor and ceil of x in nums. 
     * The floor of x is the largest element in the array,
     * which is smaller than or equal to x. 
     * The ceiling of x is the smallest element in the array,
     *  greater than or equal to x. 
     * If no floor or ceil exists, output -1.
     */
    public static void main(String[] args) {
        
    }
    static int[] FloorANDCeil(int[] arr, int x){
        int n = arr.length;
        int floor =Floor(arr, x, n);
        int ceil = Ceil(arr, x, n);
        return new int[]{floor, ceil};
    }
    static int Floor(int[] arr, int x,int n){
        int low = 0, high = n-1;
        int floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
    static int Ceil(int[] arr, int x,int n) {
        int low = 0, high = n - 1;
        int ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return ceil;
    }
}
