package array;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] ans=transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        for(int[] arr:ans){
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
