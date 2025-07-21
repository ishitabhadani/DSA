package questions;

import java.util.HashMap;

public class eight_Find_Start_of_Loop {
    /*
     * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.

     */
    public static void main(String[] args) {
        
    }
    //time - O(2n) space - O(n)
    static Node detectCycle(Node head){
        HashMap<Node, Boolean> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (map.get(temp)) {
                return temp;
            }
            map.put(temp, true);
            temp = temp.next;
        }
        return null;
    }
    //tortoise and hair algo
    static Node detectCycleOptimised(Node head){
        //checking for a loop
        Node slow=head,fast=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //finding the point of loop start
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast=fast.next;
                }
                return slow; //this will be the starting point of the loop
            }
        }
        return null;
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

