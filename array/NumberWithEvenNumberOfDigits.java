package array;

public class NumberWithEvenNumberOfDigits {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }
    static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (getCount(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int getCount(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
