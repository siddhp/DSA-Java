package array;

public class HighestAltitude {

    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};

        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {

        int[] alt=new int[gain.length+1];
        int max=0;
        alt[0]=0;

        for(int i=0;i<gain.length;i++){
            int temp=alt[i]+gain[i];
            if(temp>max){
                max=temp;
            }
            alt[i+1]=temp;
        }
        return max;
    }
}
