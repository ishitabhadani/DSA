import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class five_Intersection_of_Two_Arrays_II {
 
    
 
 /*
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     * Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     */
    
    static  int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            Integer count = freq.get(num);
            if (count != null && count > 0) {
                intersection.add(num);
                freq.put(num, count - 1);
            }
        }
        int[] ans = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            ans[i] = intersection.get(i);
        }
        return ans;
    }
    
 }

