// Add Last in LL

public class add_Last_in_LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //step1 = create new Node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) { 
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main (String args[]) {
        add_Last_in_LL ll = new add_Last_in_LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }
}