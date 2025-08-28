//my code BTW
public class HW_Subarray_Sum {
    public static void printSubarrys(int numbers[]){
        int ts = 0;
        int maxSum = 0;
        for(int i=0; i < numbers.length; i++){
            int start = i;
            for(int j=i; j < numbers.length; j++){
                int currSum = 0;
                int end = j;
                for(int k=start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }

                ts++;
                System.out.print(" : Sum of current array is: " + currSum);
                System.out.println();

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum of Subarrays is: " + maxSum);
        System.out.println("Total Subarrays: " + ts);
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printSubarrys(numbers);
    }
    
}