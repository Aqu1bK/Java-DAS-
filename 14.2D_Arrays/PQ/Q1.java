/*
 * Question 1 :Print the number of 7’s that are inthe 2d array.
 * Example : Input - int[][] array = { {4,7,8},{8,8,7} }
 * Output - 2
 */
public class Q1 {
    //my code
     public static int SevenCount(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int totalSeven = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 7){
                    totalSeven++;
                }
            }
        }
        return totalSeven;
    }

    //S6 code
    public static int secondSevenCounts(int arr[][]){
        int totalSeven = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 7){
                    totalSeven++;
                }
            }
        }
        return totalSeven;
    }

	public static void main(String[] args) {
		int arr[][] = {{4,7,8},
		               {8,8,7}};
		System.out.print(secondSevenCounts(arr));
	}
}
