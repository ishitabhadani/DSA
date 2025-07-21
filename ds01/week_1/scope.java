public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //anything initialized outside box can be used inside but initialzied inside box cant be used outside
        {
            a=7; // reasign original reference value to changed value
            int c=99;
            //values initialized inside block will remain here
        }
        //System.out.println(c); gives error as c not here in this block
    }
    //primitives pass values copys whereas others like arrays and strings pass reference 
    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
        //this change will only be valid in this function scope
    }
}
