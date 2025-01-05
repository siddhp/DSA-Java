package array;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3;
          int[] ans=shuffle(arr,n);
          System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i + n];
        }
        return ans;
    }
}
