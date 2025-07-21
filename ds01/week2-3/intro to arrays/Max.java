import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        //assuming array is not empty
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxVal<arr[i]) {
                maxVal=arr[i];
            }     
        }
        return maxVal;
    }
    static int maxRange(int[] arr, int start, int end){
        //assuming array is not empty
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (maxVal<arr[i]) {
                maxVal=arr[i];
            }     
        }
        return maxVal;
    }
}