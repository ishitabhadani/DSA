import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        
    }
    /*
     * time - O(n1+n2) worst case
     * space - O(1) ideally O(n1+n2) wprst case only to return not solve
     */
    static ArrayList Intersection(int[] a, int[] b){
        ArrayList<Integer> intersection = new ArrayList<>();

        int i=0,j=0;
        int n= a.length, m=b.length;
        while(i<n && j<m){
            if (a[i] < b[j]) {
                i++;
            }
            else if (b[j] < a[i]) {
                j++;
            }
            else{
                intersection.add(a[i]);
                i++;j++;
            }
        }

        return intersection;
    }
}
