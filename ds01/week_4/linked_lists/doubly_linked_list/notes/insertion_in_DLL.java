package notes;


public class insertion_in_DLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = convertArraytoDLL(arr);
        printDLL(head); 
        head = addBeforeHead(head, 10);
        printDLL(head);
        head = addBeforeTail(head, 100);
        printDLL(head);
        head = addBeforeKthPosition(head, 25, 3);
        printDLL(head); 
        addBeforeNode(head.next.next, 23);
        printDLL(head);

    
    }

    static Node addBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;

        return newHead;

    }

    static Node addBeforeTail(Node head, int val){
        if (head.next == null) {
            return addBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;

        return head;
    }

    static Node addBeforeKthPosition(Node head, int val, int k){
        if (k==1) {
            return addBeforeHead(head, val);
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    static void addBeforeNode(Node node , int val){
        Node prev = node.back;
        Node newNode = new Node(val, node, prev);
        prev.next = newNode;
        node.back = newNode;
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
