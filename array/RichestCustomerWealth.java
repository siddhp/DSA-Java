package array;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,2,1}};

        int ans=maximumWealth(arr);

        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {

        int row = accounts.length;
        int max = 0;

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
