package Questions;

public class three_Delete_Node {
    /*
     * Given the head of a doubly linked list, remove the node at the head of the linked list and return the head of the modified list.

    The head is the first node of the linked list.

     */
    public static void main(String[] args) {
        
    }

    class Solution {
    public ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }
}



    static class ListNode {
        int data;
        ListNode next;
        ListNode prev;
    
        ListNode(int data1, ListNode next1, ListNode back1) {
            this.data = data1;
            this.next = next1;
            this.prev = back1;
        }
    
        ListNode(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }
    
    static ListNode convertArraytoDLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;
    
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;
    
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
    
        return head;
    }
    
    static void printDLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
