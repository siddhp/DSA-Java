package array;

import java.util.Arrays;
//Find N Unique Integers Sum up to Zero
public class SumZero {

    public static void main(String[] args) {
        int[] ans=sumZero(5);

        System.out.println(Arrays.toString(ans));
    }
    static int[] sumZero(int n) {

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=i*2-n+1;
        }
        return ans;
    }
}
