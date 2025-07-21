package Queue.Notes;

import java.util.NoSuchElementException;

public class queue_using_arrays {
    public class ArrayQueue {

        private int[] queue;
        private int start;
        private int end;
        private int size;
        private int cursize;

        public ArrayQueue(int cursize) {
            if (cursize <= 0) {
                this.cursize = 1;
            } else {
                this.cursize = cursize;
            }
            this.queue = new int[this.cursize];
            this.start = -1;
            this.end = -1;
            this.size = 0;
        }

        public void push(int element) { 
            if (size == cursize) {
                return;
            }

            if (size == 0) {
                start = 0;
                end = 0;
            } else {
                end = (end + 1) % cursize;
            }
            queue[end] = element;
            size++;
        }

        public int pop() { 
            if (size == 0) {
                return 0;
            }

            int element = queue[start];
            queue[start] = 0;
            size--;

            if (size == 0) {
                start = -1;
                end = -1;
            } else {
                start = (start + 1) % cursize;
            }
            return element;
        }

        public int top() { 
            if (size == 0) {
                return 0;
            }
            return queue[start];
        }

        public int size() {
            return size;
        }
    }
}
