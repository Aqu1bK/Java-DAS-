// Question 7
// Stack and Queue using Deque
import java.util.*;

public class Implement_Queue_using_Deque {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addFirst(data);
        }

        public int remove() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    } 
}
