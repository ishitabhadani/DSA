package video_notes;

public class Delete_in_LL {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7};
        Node head = convert_arr_to_linkedlist(arr);
        head = delete_Kth_element(head,2);
        printLinkedList(head);
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    private static Node convert_arr_to_linkedlist(int[] arr) {
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

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node RemoveHead(Node head) {
        if (head == null) {
            return head;
        }
        return head.next;
    }
    static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node mover = head.next;
        while (mover.next.next != null) {
            mover=mover.next;
        }
        mover.next = null;
        return head;
    }
    static Node delete_Kth_element(Node head, int k){
        if (head==null) {
            return null;
        }
        if (k==1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node mover = head;
        Node prev = null;
        while (mover != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = mover;
            mover = mover.next;
        }
        return head;
    }
        static Node deleteElement(Node head, int element){
        if (head==null) {
            return null;
        }
        if (head.data==element) {
            head = head.next;
            return head;
        }
        Node mover = head;
        Node prev = null;
        while (mover != null) {
            
            if (mover.data==element) {
                prev.next = prev.next.next;
                break;
            }
            prev = mover;
            mover = mover.next;
        }
        return head;
    }
}
