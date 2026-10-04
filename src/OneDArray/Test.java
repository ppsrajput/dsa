package OneDArray;

public class Test {
    public static void main(String[] args) {
        //FindSubArrayHavingMaxSumKadaneAlgo

        int[] array={-20, 10, -20, -12, 6, 5, -3, 8, -2};

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            currentSum+=array[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }

            if(currentSum<0){
                currentSum=0;
            }

        }
        System.out.println(maxSum);


    }
}
