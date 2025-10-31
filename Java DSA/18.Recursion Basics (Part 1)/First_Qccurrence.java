//WAF to find first occurence of an element in an array.

public class First_Qccurrence {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
        int key = 10;
        int i = 0;
        System.out.println(firstOccurence(arr, key, i));
    }
}
