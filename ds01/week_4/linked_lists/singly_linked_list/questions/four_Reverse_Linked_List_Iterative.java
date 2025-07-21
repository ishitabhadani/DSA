package questions;

public class four_Reverse_Linked_List_Iterative {
    public static void main(String[] args) {
        
    }
    /**
 * Definition for singly-linked list.*/
    public class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }
class Solution {
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while(current != null){
            Node temp = current.next;
            current.next=prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
}
