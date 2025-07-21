package video_notes;
class Node 
 {
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;

    }
    Node(int data1){
    this.data = data1;
    this.next = null;
    }

    
}
public class convert_arr_to_linkedlist {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,3,8,9};
        Node head = convertArrayToLinkedList(arr);
        Node temp = head;

        //to print linked list
        // while (temp != null) {
        //     System.out.print(temp.data + "\t");
        //     temp = temp.next;
        // }
        Node temp1 = head;
        System.out.println(LengthOfLL(head));
    }
    static Node convertArrayToLinkedList(int[] arr) {
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
    static int LengthOfLL(Node head){
        int count = 0;

        Node temp = head;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }

        return count;
    }
}
