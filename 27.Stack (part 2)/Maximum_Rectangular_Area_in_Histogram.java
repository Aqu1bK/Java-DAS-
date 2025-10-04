// Max Area in Histogram
// Given an array of integers heights representing the histogram's bar height
// where the width of each bar is 1, return the area of the largest rectangle 
// in the histogram.

// heights = [2, 1, 5, 6, 2, 3];
// Max Area in Histogram
// Given an array of integers heights representing the histogram's bar height
// where the width of each bar is 1, return the area of the largest rectangle 
// in the histogram.

// heights = [2, 1, 5, 6, 2, 3];
import java.util.*;

public class Maximum_Rectangular_Area_in_Histogram {

    public static void maxArea(int arr[]) {  // Added return type 'void'
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {  // Fixed syntax: !s.isEmpty()
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();

        for(int i = 0; i<arr.length; i++) {  // Fixed loop condition: i<arr.length
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {  // Fixed syntax: !s.isEmpty()
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;  // Changed to -1 for proper left boundary
            }else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        //Current Area: width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }
    
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
        maxArea(arr);
    }
}