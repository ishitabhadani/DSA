package Stack.Notes;

public class stack_using_linkedlist {
    public static void main(String[] args) {
        
    }

    public static class st{
        Node top;
        int size = 0;
        public void Push(int x){
            Node temp = new Node(x);
            temp.next = temp;
            top = temp;
            size=size+1;
        }

        public void pop(){
            top=top.next;
            size --;
        }

        public int top(){
            return top.data;
        }

        public int size(){
            return size;
        }
    }


    
    static class Node {
        int data;
        Node next;
    
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    
        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }
    
    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    private static Node convertArrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
    
        Node head = new Node(arr[0]);
        Node mover = head;
    
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
    
        return head;
    }
    
}
