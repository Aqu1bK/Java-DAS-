// **Weakest Soldier**
// We are given an **m×n binary matrix** of 1's (soldiers) and 0's (civilians). 
// The soldiers are positioned in front of the civilians. 
// That is, all the 1's will appear to the left of all the 0's in each row.
// A row *i* is weaker than a row *j* if one of the following is true:
// * The number of soldiers in row *i* is less than the number of soldiers in row *j*.
// * Both rows have the same number of soldiers and *i < j*.

// Find the **K weakest rows.**

// m = 4, n = 4, k = 2

// 1 0 0 0  
// 1 1 1 1  
// 1 0 0 0  
// 1 0 0 0  

// **ans = row0 & row2**

import java.util.*;

public class Weakest_Soilder {
    static class Pair implements Comparable<Pair> { // Fixed: changed Row to Pair
        int soldiers;
        int idx;

        public Pair(int soldiers, int idx) { // Fixed: constructor name should match class name
            this.soldiers = soldiers; // Fixed: variable name typo
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair r2) { // Fixed: parameter type should be Pair
            if(this.soldiers == r2.soldiers) { // Fixed: variable name typo
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers; // Fixed: variable name typo
            }
        }
    }
    
    public static void main (String args[]) {
        int army[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k = 2;

        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Fixed: use Pair instead of Row
        
        for(int i=0; i<army.length; i++){
            int count = 0;
            for(int j = 0; j<army[0].length; j++) {
                count += army[i][j]; // Fixed: complete the statement
            }

            pq.add(new Pair(count, i));
        }

        for(int i=0; i<k; i++) {
            System.out.println("R"+pq.remove().idx);
        }
    }
}