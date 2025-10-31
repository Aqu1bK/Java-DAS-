import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_for_Objects {
    static class Student implements Comparable<Student> { //overriding
        int rank;
        String name;

        public Student(String name, int rank) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4)); //O(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->" + pq.peek().rank); //O(1)
            pq.remove(); //O(logn)
        }
    }
}