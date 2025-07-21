package Stack.Notes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queue {
    public static Queue<Integer> q = new ArrayDeque<>();
    static void push(int x){
        int s = q.size();
        q.offer(x);
        for (int i = 0; i < s; i++) {
            q.offer(q.poll());
        }
        
    }

    public static void pop(){
        int temp = q.poll();
    }

    public static int top() {
        return q.peek();
    }

    public static int size(){
        return q.size();
    }

}
