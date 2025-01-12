package array;

import java.util.ArrayList;
import java.util.List;
//Lucky Numbers in a Matrix
public class LuckyNumberInMatrix {

    public static void main(String[] args) {
        int[][] arr={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(arr).toString());
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = getMini(matrix[i]);
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {

                System.out.println(j+"    "+minIndex);
                if (max < matrix[j][minIndex]) {
                    max = matrix[j][minIndex];
                }
            }
            if (max == matrix[i][minIndex]) {
                ans.add(max);
            }
        }
        return ans;

    }

    static int getMini(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
