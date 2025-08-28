/*Question 2:There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
index k (1  <=  k  <  nums.length)  such  that  the  resulting  array 
is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed). 
For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an 
integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:Input:
nums = [4,  5, 6, 7, 0, 1, 2], target = 0 
Output: 4

Example 2:Input:
nums = [4,  5, 6, 7, 0, 1, 2], target = 3
Output: -1
*/

public class Question_2 {
     public static int rotated_or_not(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    return j;
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int nums[] = {4,  5, 6, 7, 0, 1, 2};
	    System.out.print(rotated_or_not(nums));
	}
    
}
