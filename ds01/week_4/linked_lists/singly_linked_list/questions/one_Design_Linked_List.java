package questions;

public class one_Design_Linked_List {
    
}
class MyLinkedList {
    private Node head;
    class Node {
        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next = null;
        }
    }
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        Node current = head;
        int position = 0;
        while(current != null && position < index){
            current = current.next;
            position++;
        }
        return (current == null) ? -1 : current.value;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next=head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node current = head;
        int position = 0;
        while(current != null && position < index - 1){
            current = current.next;
            position++;
        }
        if(current == null) return;

        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(head == null) return;

        if(index == 0){
            head = head.next;
            return;
        }
        Node current = head;
        int position = 0;
        
        while(current != null && position < index - 1){
            current = current.next;
            position++;
        }

        if(current == null || current.next == null) return;

        current.next = current.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */