package Questions;

import java.util.Stack;

public class four_Reverse_Doubly_Linked_List {
    public static void main(String[] args) {
        
    }

    //basic approach by stack - brute force
    //time - O(2n) space - O(1)
    static Node reverse_stack(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.data);
            temp=temp.next;
        } 
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
        }

        return head;
    }

    static Node reverseDLL(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {

            Node next = temp.next;
            temp.next = temp.back;
            temp.back = next;

            prev = temp;
            temp = next;
        }

        return prev;
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
