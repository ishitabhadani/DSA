public class three_Check_if_Array_is_Sorted{
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 2, 3, 45, 64, 65, 34, 6545, 32};
        System.out.println(sorted(arr));
    }
    //O(N) tc
    static boolean sorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]) {
                return false;                
            }
        }
        return true;
    }
}