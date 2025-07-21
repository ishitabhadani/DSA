import java.util.Arrays;

public class SwapnRev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //reversing array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap (int[] arr, int in1, int in2){
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }

}
