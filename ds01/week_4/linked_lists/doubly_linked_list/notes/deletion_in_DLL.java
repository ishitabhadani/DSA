package notes;
public class deletion_in_DLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = convertArraytoDLL(arr);
        printDLL(head); //before removal
        removeNode(head.next.next);
        printDLL(head); //after removal
    }


    static Node removeHead(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.back = null;
        return head;
    }

    static Node removeTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node NewTail = tail.back;
        NewTail.next = null;
        tail.back = null;
        return head;
    }

    static Node remove_Kth_element(Node head, int k){
        if (head == null) {
            return null;
        }
        int count = 0;
        Node knode = head;
        while (knode != null) {
            count++;
            if (count == k) {
                break;
            }
            knode = knode.next;
        }
        Node prev = knode.back;
        Node front = knode.next;
        if (prev == null && front == null) {
            return null;
        }
        else if (prev == null) {
            return removeHead(head);
        }
        else if (front == null) {
            return removeTail(head);
        }
        prev.next = front;
        front.back=prev;
        knode.next = null;
        knode.back = null;

        return head;
    }


    static void removeNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            return;
        }
        prev.next = front ;
        front.back = prev;

        temp.next = temp.back = null;
        

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
