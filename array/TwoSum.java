package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] num={3,2,4};
        int[] ans=twoSum(num,6);

        System.out.println(Arrays.toString(ans
        ));
    }
    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
