package Stack.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class three_Implement_Stack_Using_Queues {
    /*
     * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
     */

    
    public static void main(String[] args) {
    
    }
    class MyStack {

        private Queue<Integer> q1,q2;
        private int top = 0;

        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>(); 
        }
        
        public void push(int x) {
            if(empty()){
                q1.add(x);
            }
            else{
                if(q1.isEmpty()){
                    q2.add(x);
                } else{
                    q1.add(x);
                }
            }
            top = x;
        }
        
        public int pop() {
            if(q1.isEmpty()){
                int len = q2.size();
                for(int i=1 ; i<len ; i++){
                    top = q2.poll();
                    q1.add(top);
                }
                return q2.poll();
            }
            else{
                int len = q1.size();
                for(int i = 1 ; i < len ; i++){
                    top = q1.poll();
                    q2.add(top);
                }
                return q1.poll();
            }
        }
        
        public int top() {
            return top;
        }
        
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();

        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
