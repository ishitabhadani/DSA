import java.util.Arrays;

public class changeval {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,3,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
        //if making change here it will show in original var also
    }
}
