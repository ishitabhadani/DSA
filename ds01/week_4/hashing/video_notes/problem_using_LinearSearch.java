public class problem_using_LinearSearch{
    public static void main(String[] args) {
        
    }
    //first approach to tell number of times a number appears in an array 
    //useing linear search 
    //time complexity - O(N) 
    //for computing for Q elements we require O(Q*N) time
    static int count_num(int num, int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                count++;
            }
        }
        return count;
    }
    //Hashing - prestoring and fetching
    
}