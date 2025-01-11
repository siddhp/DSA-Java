package array;

public class CellsWithOddValues {

    public static void main(String[] args) {
        int m=2;int n=3;
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }

    static int oddCells(int m, int n, int[][] indices) {

        int odd = 0;
        int[][] ans = new int[m][n];

        for (int[] ind : indices) {

            for (int i = 0; i < n; i++) {
                    ans[ind[0]][i] ++;
            }

            for (int i = 0; i < m; i++) {
                    ans[i][ind[1]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( ans[i][j] % 2 != 0)
                    odd++;
            }
        }
        return odd;
    }
}
