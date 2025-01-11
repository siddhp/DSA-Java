package array;

import java.util.Arrays;

public class FlipAndInvertArray {

    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int ans[][]=flipAndInvertImage(arr);
        for(int i=0;i<ans.length;i++){
        System.out.println(Arrays.toString(ans[i]));}
    }
    static int[][] flipAndInvertImage(int[][] image) {

        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {

            for (int j = image[i].length-1; j >= 0; j--) {
                int index=(image[i].length - 1) - j;

                if (image[i][j] == 0) {
                    ans[i][index] = 1;
                } else {
                    ans[i][index] = 0;
                }

            }
        }

        return ans;
    }
}
