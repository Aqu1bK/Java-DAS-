import java.lang.reflect.Array;
import java.util.*;
public class InbuiltSort {
     // printing an sorted array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArr2(Integer arr2[]){
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Integer arr2[] = {5,4,1,3,2};
        // Arrays.sort(arr); // For Sorting full array
        // Arrays.sort(arr,0,3); //For Sorting a part of array
        // Arrays.sort(arr2, Collections.reverseOrder()); // For sorting a array in descending order
        Arrays.sort(arr2, 0,3 ,Collections.reverseOrder()); // For sorting a part of array in descending order
        // printArr(arr2);
        printArr2(arr2);
    }
}
