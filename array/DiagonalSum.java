package array;

public class DiagonalSum {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] mat) {

        int sum = 0;
        int i = 0;
        int j = mat.length - 1;

        for (int k = 0; k < mat.length; k++) {
            sum += mat[i][i];
            if (i != j)
                sum += mat[i][j];
            j--;
            i++;
        }

        return sum;
    }
}
