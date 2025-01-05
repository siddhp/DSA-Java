package array;

import java.util.ArrayList;
import java.util.List;

public class KidsWIthGreatestNumbersOfCandies {

    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int n=3;

        System.out.println(kidsWithCandies(arr,n));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            ans.add(candies[i] + extraCandies >= max ? true : false);
        }

        return ans;
    }
}
