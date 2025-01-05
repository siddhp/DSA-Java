package array;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        int[] arr={3,1,2,10,1};
        int[] ans=runningSum(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i == 0)
                nums[i] = nums[i];
            else {
                nums[i] = nums[i] + nums[i - 1];
            }
        }
        return nums;
    }
}
