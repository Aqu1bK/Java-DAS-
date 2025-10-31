public class Majority_Element_bruteForce {
    public static int majorityElement(int[] nums) {
                int freq = 0;
        int maj = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[j] == nums[i]) {
                    count++;
                }
                if(count > freq){
                    freq = count;
                    maj = nums[i];
                }
            }
        }
        return maj;
    }
    public static void main(String[] args) {
	int nums[] = {3,2,3,2,2,2};
	int ans = majorityElement(nums);
	System.out.print(ans);
	}
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)