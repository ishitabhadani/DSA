package Questions;

public class two_Insert_At_Given_Position {
    public static void main(String[] args) {
        
    }
    static Node insertAtKthPosition(Node head, int val, int k){
        if (k == 1) {
            return addBeforeHead(head, val); 
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {

            Node tail = head;
            while (tail.next != null){
                tail = tail.next;
            }
            Node newNode = new Node(val, null, tail);
            tail.next = newNode;
            return head;
        }

        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        if (prev != null) prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    static Node addBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;

        return newHead;

    }
    static class Node {
        int data;
        Node next;
        Node back;
    
        Node(int data1, Node next1, Node back1) {
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
    
        Node(int data1) {
            this.data = data1;
            this.next = null;
            this.back = null;
        }
    }
    
    static Node convertArraytoDLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;
    
        Node head = new Node(arr[0]);
        Node prev = head;
    
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
    
        return head;
    }
    
    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
