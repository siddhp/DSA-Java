package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {

    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};

        int[] ans=createTargetArray(nums,index);

        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansList = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ansList.add(index[i], nums[i]);
        }
 
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
