package questions;

public class twelve_Remove_Nth_From_End {
    public static void main(String[] args) {
        
    }

    static Node DeleteNthFromEnd(Node head, int n){
        if(head == null) return null;
        Node start = new Node();
        start.next = head;
        Node fast=start,slow=start;
        for (int i = 0; i < n ; i++) {
            fast=fast.next;
        }
        //case where n = lnegth of list
        if(fast.next==null) return head.next;
        //all other cases
        while (fast.next != null) {
            fast= fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    static class Node {
        int data;
        Node next;
        Node() {}
    
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    
        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }
}
