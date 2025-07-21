package Stack.Notes;

import java.util.Arrays;

public class stack_using_arrays {
    public class StImpl {

    private int[] st;
    private int top;
    private int size;

    public StImpl(int cursize) {
        if (cursize <= 0) {
            this.size = 1;
        } else {
            this.size = cursize;
        }
        this.st = new int[this.size];
        this.top = -1;
    }

    public void push(int element) {
        if (top == size - 1) {
            return;
        }
        top++;
        st[top] = element;
    }

    public int pop() {
        if (top == -1) {
            return 0;
        }
        int element = st[top];
        st[top] = 0;
        top--;
        return element;
    }

    public int top() {
        if (top == -1) {
            return 0;
        }
        return st[top];
    }

    public int size() {
        return top + 1;
    }
}
}
