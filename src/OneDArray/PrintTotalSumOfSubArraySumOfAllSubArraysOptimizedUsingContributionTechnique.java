package OneDArray;

public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimizedUsingContributionTechnique {

    public static void main(String[] args) {
       int[] array={3,2,5};

        int length=array.length;
        //{3,5,10}
//        int totalSubArray=(array.length*(array.length+1))/2;
//        System.out.println(totalSubArray);
//        int[] pf=new int[array.length];
//        int summ=0;
//        for(int i=0;i<array.length;i++){
//
//            summ=summ+array[i];
//            pf[i]=summ;
//        }
//        System.out.println(Arrays.toString(pf));

        int sum=0;
        for(int i=0;i<array.length;i++){

           int contributionsInSubArray=(i+1)*(((array.length-i)));
            sum+=contributionsInSubArray*array[i];

        }
        System.out.println(sum);

        ///  TC is  Big(N)



    }
}
