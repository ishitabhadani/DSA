public class linear_search{
    public static void main(String[] args) {
        int[] arr = {75,86,73,922,766,36,856,28,-82,48,26,-568};
        int ans = linearsearch(arr, -88);
        System.out.println("found at index: "+ans);
    }
    //search in the array and return index if item found
    // otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length==0) {
            return -1;         
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for ele equal to targer
            int ele = arr[index];
            if(ele== target){
                return index;
            }        
        }
        // this will execute only if none other returns have executed i.e. target not found
        return -1;
    }
}