// WAF to find the last occurrence of an element in an array.

public class Last_Occurrence {
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

     public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
        int key = 10;
        int i = 0;
        System.out.println(lastOccurence(arr, key, i));
    }
}
