import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        multi(10, 20, "uhrughur","rhfuhurh","fruhfruhf");
    }
    static void fun(int ...v){//v is a variabe length argument
        System.out.println(Arrays.toString(v));
    }
    static void multi(int a, int b , String ...v){
            System.out.println(a);
            System.out.println(b);
    }
}
