package Stack.Questions;

import java.util.Stack;

public class eight_Min_Stack {
    /*
     * 155. Min Stack
Medium
Topics
premium lock icon
Companies
Hint
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]
Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
     */

     
class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        int val = st.pop();
        if (val == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

//optimised solution
class MinStack2 {
    long min;
    Stack<Long> st;

    public MinStack2() {
        st = new Stack<>();
    }

    public void push(int x) {
        if (st.isEmpty()) {
            min = x;
            st.push(0L);
        } else {
            st.push((long)x - min);
            if (x < min) {
                min = x;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long diff = st.pop();
        if (diff < 0) {
            min = min - diff;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long diff = st.peek();
        if (diff >= 0) {
            return (int)(min + diff);
        } else {
            return (int)min;
        }
    }

    public int getMin() {
        return (int)min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
