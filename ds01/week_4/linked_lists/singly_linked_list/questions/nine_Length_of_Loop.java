package questions;

import java.util.HashMap;

public class nine_Length_of_Loop {
    /*
     * Given the head of a singly linked list, find the length of the loop in the linked list if it exists. Return the length of the loop if it exists; otherwise, return 0.



A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer. Internally, pos is used to denote the index (0-based) of the node from where the loop starts.



Note that pos is not passed as a parameter.


Examples:


Input: head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1

Output: 4

Explanation: 2 -> 3 -> 4 -> 5 - >2, length of loop = 4.



Input: head -> 1 -> 3 -> 7 -> 4, pos = -1

Output: 0

Explanation: No loop is present in the linked list.
     */
    public static void main(String[] args) {
        
    }
    static int CountLoopLength(Node head){
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int timer = 1;
        while (temp != null) {
            if (map.containsKey(temp)) {
                int value = map.get(temp);
                return timer-value;
            }
            map.put(temp, timer);
            timer++;
            temp=temp.next;
        }
        return 0;
    }  
    //tortoise and hare algo - optimal
    static int LoopLengthOptimal(Node head){
        Node slow=head,fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return findLength(slow,fast);
            }
        }
        return 0;
    }

    static int findLength(Node slow, Node fast){
        int count = 1;
        fast = fast.next;
        while (slow!=fast) {
            count++;
            fast=fast.next;
        }
        return count;
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
