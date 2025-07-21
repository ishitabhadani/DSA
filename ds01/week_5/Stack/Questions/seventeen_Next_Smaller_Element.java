package Stack.Questions;

import java.util.Stack;

public class seventeen_Next_Smaller_Element {
    /*
     * Next Smaller Element
    0
    100
    Given an array of integers arr, your task is to find the Next Smaller Element (NSE) for every element in the array.
    The Next Smaller Element for an element x is defined as the first element to the right of x that is smaller than x.
    If there is no smaller element to the right, then the NSE is -1.
    Examples:
    Input: arr = [4, 8, 5, 2, 25]
    Output: [2, 5, 2, -1, -1]
    Explanation:
    - For 4, the next smaller element is 2.
    - For 8, the next smaller element is 5.
    - For 5, the next smaller element is 2.
    - For 2, there is no smaller element to its right → -1.
    - For 25, no smaller element exists → -1.
    Input: arr = [10, 9, 8, 7]
    Output: [9, 8, 7, -1]
    Explanation:
    Each element’s next right neighbor is smaller.
    Input: arr = [1, 2, 3, 4, 5]
    [-1, -1, -1, -1, -1]
    [5, 4, 3, 2, 1]
    [0, 0, 0, 0, 0]
    [1, 1, 1, 1, 1]
    */

    public static void main(String[] args) {
        
    }

    public int[] nextSmallerElements(int[] arr) {
        
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek()>= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nse;

    }
}
