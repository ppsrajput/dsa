package OneDArray;

import java.util.Arrays;

public class FindSubArrayHavingMaxSumKadaneAlgo {
    public static void main(String[] args) {
        int[] array = {-20, 10, -20, -12, 6, 5, -3, 8, -2};


        int maxSubArraySum = Integer.MIN_VALUE;

        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];


            if (currentSum > maxSubArraySum) {
                maxSubArraySum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

        }

        System.out.println("max sum of sub array is " + maxSubArraySum);
    }
}
