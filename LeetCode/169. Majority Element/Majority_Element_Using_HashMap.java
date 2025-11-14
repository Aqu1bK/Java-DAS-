import java.util.*;

public class Majority_Element_Using_HashMap {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	int nums[] = {3,2,3,2,2,2};
	System.out.print(majorityElement(nums));
	}
}