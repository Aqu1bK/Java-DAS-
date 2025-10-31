// Activity Selection
// You are given n activities with their start and finish times. Select the maximum number of 
// activities that can be performed by a single person, assuming that a person can only work on a
// single activity at a time.

// start  = [10, 12, 20]   ans = 2(AO & A2)
// end = [20, 25, 30]

import java.lang.reflect.Array;
import java.util.*;

public class Activity_Selection {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //sorting
        int activites[][] = new int [start.length][3];
        for(int i=0; i<start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        //end time bases sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];
        for(int i=1; i<end.length; i++) {
            if(activites[i][1] >= lastEnd) {
                //activity selected
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
         }
        System.out.println("max activites = " + maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i) + " ");
        } 
        System.out.println();
    }
}