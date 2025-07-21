import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class six_Left_Rotate_Array_by_D_Places {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3};
        ShiftByD_REVERSAL(nums,2);
        System.out.println(Arrays.toString(nums));
    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;

        List<Integer> temp = new ArrayList<>(arr.subList(0, k));

        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        for (int i = 0; i < k; i++) {
            arr.set(n - k + i, temp.get(i));
        }

        return arr;
    }

    //Time - O(N+d) SC - O(D)
    static void ShiftByD(int[] arr, int d){
        int[] temp = Arrays.copyOfRange(arr,0,(d+1));
        int n=arr.length;
        d=d%n;
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i]; 
        }
        for (int i = n-d; i < n; i++) {
            arr[i]=temp[i-(n-d)];
        }
    }
    //time- O(2N) space - O(1)
    public static void ShiftByD_REVERSAL(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

