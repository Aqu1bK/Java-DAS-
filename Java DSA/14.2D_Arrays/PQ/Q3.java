/*
 * Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?
 * Transpose of a matrix is the process ofswapping therows to columns. 
 * For a 2x3 matrix
 * 
 * Matrix
 * a11    a12    a13
 * a21    a22    a23
 * 
 * Transposed Matrix
 * a11    a21
 * a12    a22
 * a13    a23
 */
public class Q3 {
    // My code 
    public static void myTranspose(int [][] arr) {
        for(int i =0; i<arr[0].length; i++){
		    for(int j=0; j<arr.length; j++){
		        System.out.print(arr[j][i] + " ");
		    }
		    System.out.println();
		}
    }
    	public static void main(String[] args) {
		int [][] arr = {{11,12,13},
		                {21,22,23}};
		                
		myTranspose(arr);
	}    
}
