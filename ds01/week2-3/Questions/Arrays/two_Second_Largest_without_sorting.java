import java.util.Arrays;

public class two_Second_Largest_without_sorting {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,2,3,45,64,65,34,6545,32};
        //System.out.println(SecondLargest1(arr, arr.length));
        //System.out.println(SecondLargest2(arr, arr.length));
        System.out.println(SecondLargest3(arr, arr.length));
        System.out.println(SecondSmallest(arr, arr.length));
    }
    //Option one- Brute(O(NlogN+N))
    /*static int SecondLargest1(int[] arr, int n){
        Arrays.sort(arr);
        
        

        int SecondLargest=-1;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != Largest) {
                SecondLargest = arr[i];
                break;          
            }
        }

        return SecondLargest;
    }*/
    //Buffer (O(2N))
    /*static int SecondLargest2(int[] arr, int n){
        
        int Largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }

        int SecondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > SecondLargest && arr[i]!=Largest) {
                SecondLargest = arr[i];                
            }
        }

        return SecondLargest;
    }*/
    //optimal solution O(N)
    static int SecondLargest3(int[] a, int n){
        int largest = a[0];
        int SLargest = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                SLargest = largest;
                largest = a[i];                
            }
            else if (a[i] < largest && a[i] > SLargest) {
                SLargest = a[i];
            }
        }
        return SLargest;
    }
    static int SecondSmallest(int[] a, int n){
        int smallest = a[0];
        int Ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (smallest > a[i]) {
                Ssmallest = smallest;
                smallest = a[i];
            }
            else if (a[i] != smallest && a[i] < Ssmallest) {
                Ssmallest = a[i];                
            }        
        }
        return Ssmallest;
    }
}
