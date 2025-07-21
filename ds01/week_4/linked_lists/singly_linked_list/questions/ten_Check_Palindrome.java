package questions;

import java.util.Stack;

import questions.four_Reverse_Linked_List_Iterative.Node;

public class ten_Check_Palindrome {
    /*
     * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
     */
    public static void main(String[] args) {
        
    }
    static boolean checkPalindrome(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != st.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    //using tortoise and hare algo
    //time - O(N/2) space O(1)
    static boolean CheckPalindrome(Node head){
        Node slow=head,fast=head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast=fast.next.next;

        }
        Node newHead = reverse(slow.next);
        Node first = head, second = newHead;
        while (second != null) {
            if (first.data != second.data) {
                reverse(newHead);
                return false;
            }
            first= first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
    private static Node reverse(Node head) {
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
