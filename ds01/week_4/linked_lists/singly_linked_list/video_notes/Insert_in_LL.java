package video_notes;
public class Insert_in_LL {
    public static void main(String[] args) {
        int[] arr = {12,5,8,7};
        Node head = convertArrayToLinkedList(arr);
        head = insertAtHead(head, 10);
        head = insertAtTail(head, 100);
        insert_before_value(head, 33, 5);
        printLinkedList(head);
    }
    static Node insertAtHead(Node head, int element){
        return new Node(element,head);
        
    }
    static Node insertAtTail(Node head, int element){
        if (head == null) {
            return new Node(element);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(element);
        return head;
    }
    static Node insert_at_K(Node head,int element , int k){
        if (head==null) {
            if (k==1) {
                return new Node(element);
            }
            else{
                return null;
            }
        }
        if (k==1) {
            Node temp = new Node(element, head);
            return temp;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count ++;
            if (count == k-1) {
                Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    
    static Node insert_before_value(Node head,int element , int value){
        if (head==null) {
                return null;
        }
        if (head.data == value) {
            return new Node(element,head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                return head;
            }
            temp = temp.next;
        }
        return head;
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
