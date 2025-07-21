import java.util.Arrays;

public class ten_Find_Missing_Number_in_Array {
    public static void main(String[] args) {

    }
    /*
     import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
     */

    static int FindMissing(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int flag=0;
            for (int j = 0; j < n-1; j++) {
                if (a[j] == i) {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return n;
    }
    //using hashing
    /*
     * time- O(2N)
     * space- O(N)
     */
    static int missingNumber_ByHashing(int[] a){
        int n = a.length;
        int[] hash = new int[n+1];
        for (int i = 0; i < n; i++) {
            hash[a[i]]=1;
        }
        for (int i = 0; i < n+1; i++) {
            if (hash[i]==0) {
                return i;
            }
        }
        return n;
    }
    //Optimal solution
    /*
     * Time - O(N)
     * space - O(1)
     */
    static int missingNumber_BySum(int[] a){
        int n = a.length;
        int sum = n*(n+1)/2;
        int sum2=0;
        for (int i = 0; i < n; i++) {
            sum2+=a[i];
        }
        return sum-sum2;
    }
    //using XOR

    //a^a=0 same numbers xor is always 0
    //0^a=a xor of 0 with a number is the number itself
    static int missingNumber_ByXOR(int[] a){
        int xor1=0,xor2=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ i;
        }
        for (int i = 0; i < n-1; i++) {
            xor2= xor2^a[i];
        }
        return xor1^xor2;
    }
}
