// Head And Tail in LL
import java.util.*;

public class Head_And_Tail_in_LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        
        }
    }
    public static Node head;
    public static Node tail;

    //Methods
    // add()
    // remove()
    // print()
    // Search()

    public static void main (String args[]) {
        Head_And_Tail_in_LL ll = new Head_And_Tail_in_LL();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        // we will make methods in linked list class
      }
}
