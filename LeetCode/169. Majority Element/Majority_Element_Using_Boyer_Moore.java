import java.util.*;

public class Majority_Element_Using_Boyer_Moore {
    public static int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++) {
            if(freq == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 3, 2, 2, 2};
        System.out.print(majorityElement(nums));
    }
}