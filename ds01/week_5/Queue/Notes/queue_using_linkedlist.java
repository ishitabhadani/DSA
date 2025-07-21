package Queue.Notes;

public class queue_using_linkedlist {
    public static void main(String[] args) {
        
    }



    public static class QueueLL {
        
        Node start , end;
        int size = 0;
        public void push(int x){
            Node temp = new Node(x);
            if (start == null) {
                start = end = temp;
            }
            else{
                end.next = temp;
            }
            size+=1;
        }
        public void pop(){
            if (start == null) {
                return;
            }
            start= start.next;
            size-=1;
        }

        public int top(){
            if (start == null) {
                return -1;
            }
            return start.data;
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
