public class syntax{
    public static void main(String[] args) {
        //syntax for arrays
        /*
        array definition:
         datatype[] var_name = new datatype[size];
         */
        //store 5 rnos
        // int[] rnos= new int[5];
        // or directly
        // int[] rnos2 = {23, 12, 25, 30, 32, 15};
        //datatype bascially represents what is the type of data stored inside the array
        //array is collection of a single type of datatypes: we cant use string and integers in one single array
        int[] rnos; //declareation of array, rnos is getting defined in stack
        rnos = new int[5]; // initialzation: actually here obj is created in the heap memory
        String arrString[]= new String[5];
        System.out.println(arrString[0]);//null



    }   
}