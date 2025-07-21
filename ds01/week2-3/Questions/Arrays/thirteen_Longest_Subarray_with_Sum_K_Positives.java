import java.lang.Thread.State;
import java.util.HashMap;
import java.util.Map;

public class thirteen_Longest_Subarray_with_Sum_K_Positives {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,1,1,1,9,3,2,1,2,3,1};
        int ans = LongestArr_TwoPointer(arr, 5);
        System.out.println(ans);
    }
    //brute - taking all possible sub-arrays
    /*
     * time - O(N^2)
     * space - O(1)
     */
    static int LongestArr(int[] arr, int k){
        int n = arr.length;
        int max_len=0;
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < n; j++) {
                // int sum=0;
                // for (int l = 0; l < j; l++) {
                //     sum+=arr[l];
                // }
                sum+=arr[j];
                if (sum==k) {
                    int mex_len=Math.max(max_len, j-i+1);                    
                }
            }
        }
        return max_len;
    }
    //better - hashing
    static int LongestArr_Hashing(int[] a, long k ){
        long sum = 0;
        int max_len = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if (sum==k) {
                max_len = Math.max(max_len, i+1);
            }
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                max_len = Math.max(max_len,len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return max_len;
    }

    //optimal only for array with +ve and 0
    /*
     * time - O(2N)
     * space - O(1)
     */
    static int LongestArr_TwoPointer(int[] a, long k){
        int left=0,right=0;
        long sum = 0;
        int maxLen=0;
        int n = a.length;
        while (right<n) {
            while (left<=right && sum>k) {
                sum -= a[left];
                left++;
            }
            if (sum==k) {
                maxLen = Math.max(maxLen, right-left);
            }
            right++;
            if (right<n) {
                sum += a[right];
            }
            
        }
        return maxLen;
    }
    static int LongestArr_gpt(int[] a, long k){
        int left = 0, right = 0;
        long sum = 0;
        int maxLen = 0;
        int n = a.length;

        while (right < n) {
            sum += a[right];  // Include current element

            // Shrink window from the left if sum exceeds k
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // If sum matches k, update max length
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;  // Move right pointer forward
        }

        return maxLen;
    }

}
