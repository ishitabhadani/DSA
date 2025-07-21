public class overlaoding {
    public static void main(String[] args) {
        fun(87);
        fun("Hello");
        sum(2,3,4);
        sum(1,3);

    }
    //two functions of same name can exist if it has different type of argument or number of args is different
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
    static void sum(int a, int b){
        int sum=a+b;
    }
    static void sum(int a, int b,int c){
        int sum=a+b+c;
    }
    
}
