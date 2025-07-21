package Queue.Questions;

import java.util.Stack;

public class four_Implement_Queue_Using_Stacks {
    /*
     * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.

     */

    class MyQueue {

        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }
        
        public void push(int x) {
            s1.push(x);
        }
        
        public int pop() {
            if (s2.empty()) {
                transferElements();
            }
            return s2.pop();
        }
        
        public int peek() {
            if (s2.empty()) {
                transferElements();
            }
            return s2.peek();
        }
        
        public boolean empty() {
            return s1.empty() && s2.empty();
        }

        private void transferElements() {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
    }
}
