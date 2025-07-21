import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {12,65,78,2,3,45,9,1,5};
        MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSort(int[] arr, int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr,low,mid,high);
    }
    static void Merge(int arr[], int low, int mid, int high){
        int middle = mid;
        int right = high;
        int left = low;
         int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[]
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[]
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
