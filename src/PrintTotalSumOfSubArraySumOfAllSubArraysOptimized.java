import java.util.Arrays;

public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimized {

    public static void main(String[] args) {
        int[] array={1,2};
        //{3,5,10}
        int totalSubArray=(array.length*(array.length+1))/2;
        System.out.println(totalSubArray);
        int[] pf=new int[array.length];
        int summ=0;
        for(int i=0;i<array.length;i++){

            summ=summ+array[i];
            pf[i]=summ;
        }
        System.out.println(Arrays.toString(pf));


        for(int x=0;x<totalSubArray;x++){

        }






        int totalSum=0;
        for(int s=0;s<array.length;s++){
            int sum=0;
            for (int e=s;e<array.length;e++){

                sum+=array[e];
                totalSum+=sum;
                System.out.println("sum is "+sum);
            }
        }
        System.out.println("totalSum "+totalSum);
        ///  TC is  Big(N^2)
    }
}
