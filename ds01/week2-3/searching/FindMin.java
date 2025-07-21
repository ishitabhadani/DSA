public class FindMin {
        public static void main(String[] args) {
        int[] arr = {75,86,73,922,766,36,856,28,-82,48,26,-568};
        int ans = min(arr);
        System.out.println("min val: "+ans);
    }
    //search in the array and return index if item found
    // otherwise if item not found return -1
    static int min(int[] arr){
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            
            if(ans>arr[index]){
                ans = arr[index];
            }        
        }
        // this will execute only if none other returns have executed i.e. target not found
        return ans;
    }
}
