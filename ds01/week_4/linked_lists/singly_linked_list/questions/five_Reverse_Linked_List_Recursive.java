package questions;

public class five_Reverse_Linked_List_Recursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrayToLinkedList(arr);
        head = reverse_LL_recursive(head, null);
        printLinkedList(head);
    }

    static Node reverse_LL_recursive(Node current, Node prev) {
        if (current == null) {
            return prev;
        }

        Node next = current.next;
        current.next = prev;

        return reverse_LL_recursive(next, current);
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
