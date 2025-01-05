package array;

import java.util.Arrays;

public class SmallerThanCurrentElement {

    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        int[] ans=smallerNumbersThanCurrent(arr);

        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;
                if (nums[j] < current) {
                    count++;
                }

            }
            ans[i] = count;
        }

        return ans;
    }
}
