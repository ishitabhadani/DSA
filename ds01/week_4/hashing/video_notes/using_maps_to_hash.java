import java.util.HashMap;
import java.util.Scanner;

public class using_maps_to_hash {
    public static void main(String[] args) {
        /*
         * map is of format <key,value>
         *                  [number, frequency]
         * basically has key value pairs
         * even if theres a single high number like in array [1,2,3,4,5,18] 
         * we can just have 6 keys in maps but in array hashing we will have to make an array of 19 elemnts
         */

        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt(); //length of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //declare hashmap for pre-compute
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        int q; //number of queries
        q=in.nextInt();
        while (q>0) {
            int num = in.nextInt();
            System.out.println(hash.getOrDefault(num,0));
            q--;
        }

        /*
         * time complexity
        average case - O(1) - most cases
        worst case - O(n)
         
        HASHING 
        -methods
            * division method
            * folding method
            * mid square method
         */

    }
}
