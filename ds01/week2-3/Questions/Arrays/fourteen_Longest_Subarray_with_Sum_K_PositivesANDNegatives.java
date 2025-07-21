import java.util.HashMap;
import java.util.Map;

public class fourteen_Longest_Subarray_with_Sum_K_PositivesANDNegatives{
    public static void main(String[] args) {
        
    }
    /*
    *time
     -O(NlogN)-for ordered
     -O(N^2) - for unordered
    *space
     -O(N)
     */
    static int longestSubarrayWithSumK(int[] a, long k) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int max_len = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                max_len = Math.max(max_len, i + 1);
            }

            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                max_len = Math.max(max_len, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return max_len;
    }
}
