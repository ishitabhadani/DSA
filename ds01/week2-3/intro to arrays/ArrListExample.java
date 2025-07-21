import java.util.ArrayList;
import java.util.Scanner;

public class ArrListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        //Integer= Type of arraylist cant do primitive u have to use rapper classes
        Scanner in = new Scanner(System.in);
        // list.add(67);
        // list.add(65);
        // list.add(98);
        // list.add(87);
        // System.out.println(list);
        // System.out.println(list.contains(67)); //true
        // System.out.println(list.contains(54)); //false

        // list.set(0, 99); //set 0th element to 99
        // list.remove(2); //remove element at 2nd index
        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item from list
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));    //pass index here, list[index] syntax wont work here 
        }
        /*
            1. size is internally fixed
            2. say arraylist filled by some amt
                - it will create a new array list of say double the size
                - old elements are copied to new one
                - old one is deleted
         */
    }
}
