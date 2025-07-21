import java.util.HashMap;

public class two_Find_Duplicates {
    public static void main(String[] args) {
        
    }
    //this is giving better result
    public int findDuplicateBETTER(int[] nums) {
        int[] hash = new int[100001]; 
        for (int num:nums) {
            hash[num]++;
            if (hash[num]>1) {
                return num;
            }
        }
        return -1;
    }

    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1); 
            if(frequency.get(num)>1){
                return num;
            }
        }
        return -1;
    }

    
}

