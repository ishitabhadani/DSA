package Notes;

public class intro_to_recursion {
    public static void main(String[] args) {
        
    }
    //print 1 infinite times
    public static void print1() {
        System.out.println(1);
        print1(); // recursive call
    }

    //print numbers from 1 to infinite times
    int count = 0;
    public void printn(){
        System.out.println(count);
        count++;
        printn(); // recursive call
    }

    //print numbers from 1 to 4
    int cnt = 0;
    public void print1to4() {
        if (cnt == 3) {
            return; // base condition to stop recursion
        }
        System.out.println(cnt);
        cnt++;
        print1to4(); // recursive call
    }

    /*
     * recursion tree
     * f() ->
     *          f() ->
     *                  f() ->
     *                          f() ->
     * this tree is a recursion tree
    
     */



}
