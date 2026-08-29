package OneDArray;

public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimized {

    public static void main(String[] args) {
        int[] array={3,2,5};
        //{3,5,10}



        int totalSum=0; int count=0;
        for(int s=0;s<array.length;s++){
            int sum=0;

            for (int e=s;e<array.length;e++){

                sum+=array[e];
                totalSum+=sum;
                count++;
                System.out.println("sum of  "+count +" sub array is "+sum);
            }
        }
        System.out.println("totalSum "+totalSum);
        ///  TC is  Big(N^2)
    }
}
