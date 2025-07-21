public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,57,93,03,-34,92};
        int target = 57;
        System.out.println(linearsearch(arr, target, 1, 6));
    }

        static int linearsearch(int[] arr, int target, int start, int end){
        if (arr.length==0) {
            return -1;         
        }
        //run a for loop in range 
        for (int index = start; index <= end; index++) {
            //check for ele equal to target
            int ele = arr[index];
            if(ele== target){
                return index;
            }        
        }
        // this will execute only if none other returns have executed i.e. target not found
        return -1;
        }
}
