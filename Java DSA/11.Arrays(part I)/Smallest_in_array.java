public class Smallest_in_array {
    //my code
    public static int largest(int arr[]) { 
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }     
        }
        return smallest;
    }

    //sigma 6.0 code
    public static int getSmallgest(int arr[]) { 
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }     
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // System.out.println(smallest(arr));
        System.out.println(getSmallgest(arr));
    }
}


