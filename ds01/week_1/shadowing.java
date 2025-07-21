
public class shadowing {
    static int x=90; //will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40; //the class var at line 3 will be shadowed by this
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
