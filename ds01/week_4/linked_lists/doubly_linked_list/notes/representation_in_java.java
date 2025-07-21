package notes;
public class representation_in_java {
    public static void main(String[] args) {
        int[] arr = {12,5,8,7};
        Node head = convertArraytoDLL(arr);
        printDLL(head);
    }
    static class Node {
        int data;
        Node next;
        Node back;
        Node(int data1, Node next1 , Node back1) {
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

    static Node convertArraytoDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null , prev);
            prev.next=temp;
            prev = temp;
        }
        return head;
        
    }
    static void printDLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
