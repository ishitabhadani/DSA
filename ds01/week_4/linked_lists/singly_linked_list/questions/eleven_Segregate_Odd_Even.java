package questions;

public class eleven_Segregate_Odd_Even {
    /*
     * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
     */
    public static void main(String[] args) {
        
    }

    static Node OddEven(Node head){
        if(head == null) return null;
        Node odd=head,even=head.next,evenHead=even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
