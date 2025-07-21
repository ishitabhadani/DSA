package Queue.Notes;

import java.util.Stack;

public class queue_using_stack {
    public static class QueueStack {
        public static Stack<Integer> s1,s2 = new Stack<>();

        //time - O(2N) space - O(2N)
        public void push(int x){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        // time O(1)
        public int top(){
            return s1.peek();
        }

        // time O(1)
        public void pop(){
            s1.pop();
        }
        
    }


    //approach 2 to optimise push but de-optimises pop and top
    public class QueueStack2 {
        private Stack<Integer> s1,s2;
        public QueueStack2(){
            s1 = new Stack<>();
            s2 = new Stack<>();
        }
        void push(int x){
            s1.push(x);
        }

        void pop(){
            if (!s2.isEmpty()) {
                s2.pop();
            }
            else{
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s2.pop();
            }


        }

        int top(){
            if (!s2.isEmpty()) {
                return s2.peek();
            }
            else{
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }

}
