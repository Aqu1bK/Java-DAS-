/*
 * Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
 * Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
 * Output - 18
 */
public class Q2 {
//     //my Code 
//     public static void main(String[] args) {
// 		int nums[][] ={{1,4,9},
// 		               {11,4,3},
// 		               {2,2,3}};
	
// 	int totalSum = 0;
// 	for(int i=0; i<nums.length; i++){
// 	    for(int j=0;j<nums[0].length; j++){
// 	        if((i == 1 && j==0) || (i==1 && j==1) || (i==1 && j==2)){
// 	            totalSum += nums[i][j];
// 	            System.out.println("( "+i + ","+ j+ ")"+ "=" + totalSum );
// 	        }
// 	    }
// 	}
// 	System.out.println(totalSum);
// }

// S6 code 
    public static void main(String args[]){
        int [][] nums = {{1,4,9}, {11,4,3}, {2,2,3}};
        int totalSum = 0;

        //sum of 2nd row elements
        for(int j=0; j<nums[0].length; j++){
            totalSum += nums[1][j];
        }
        System.out.println(totalSum);
    }
    
}
