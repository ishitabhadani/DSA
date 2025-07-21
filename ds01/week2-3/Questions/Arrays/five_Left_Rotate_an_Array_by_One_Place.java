public class five_Left_Rotate_an_Array_by_One_Place{
    public static void main(String[] args) {
        
    }
    static int[] rotateArray(int[] arr, int n) {
        int first = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=first;
        return arr;
    }
    //time-O(N) space-O(N)
}
