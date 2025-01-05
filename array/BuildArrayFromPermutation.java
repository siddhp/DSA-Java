package array;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString( buildArray(new int[]{0,2,1,5,3,4})));
    }

    static int[] buildArray(int[] nums) {

        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
