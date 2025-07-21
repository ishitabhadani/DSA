import java.util.HashMap;

public class one_Count_Frequencies {
    public static void main(String[] args) {
        
    }
    /*
     * class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            int cnt = map.get(key);
            if(cnt>1){
                ans += (cnt*(cnt-1))/2;
            }
        }
        return ans;
    }
}
     */
    static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            int cnt = map.get(key);
            if(cnt>1){
                ans += (cnt*(cnt-1))/2;
            }
        }
        return ans;
    }
}
