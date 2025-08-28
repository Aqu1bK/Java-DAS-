public class Largest_in_array {
    //my code
    public static int largest(int arr[]) { 
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }     
        }
        return largest;
    }

    //sigma 6.0 code
    public static int getlargest(int arr[]) { 
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }     
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // System.out.println(largest(arr));
        System.out.println(getlargest(arr));
    }
}
