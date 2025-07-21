package questions;

public class three_Delete_Node {
    public static void main(String[] args) {
        
    }
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
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
}

