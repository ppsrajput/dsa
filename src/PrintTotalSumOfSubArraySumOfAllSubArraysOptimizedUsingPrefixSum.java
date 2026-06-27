import java.util.Arrays;

public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimizedUsingPrefixSum {

    public static void main(String[] args) {
        int[] array={3,2,5};
        //{3,5,10}
        int totalSubArray=(array.length*(array.length+1))/2;
        System.out.println(totalSubArray);


        int totalSum=0; int count=0;
        int[] pf=new int[array.length];
        int x=0;
        for(int i=0;i<array.length;i++){
            x+=array[i];
            pf[i]=x;
        }
        System.out.println(Arrays.toString(pf));
        for(int s=0;s<array.length;s++){
            int sum=0;

            for (int e=s;e<array.length;e++){

                if(s==0){
                    sum=pf[e];
                }else{
                    sum=pf[e]-pf[s-1];
                }

                totalSum+=sum;
                count++;
                System.out.println("sum of  "+count +" sub array is "+sum);
            }
        }
        System.out.println("totalSum "+totalSum);
        ///  TC is  Big(N^2)
    }
}
