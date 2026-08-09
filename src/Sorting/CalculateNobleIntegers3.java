package Sorting;

import java.util.Arrays;

public class CalculateNobleIntegers3 {
    /*An element in arr[] is said to be noble if {Count of smaller elements  = element itself}
     *
     */


    public static void main(String[] args) {
        // int[] array={-10,1,1,2,4,4,4,8,10};
        int[] array = {-3, 0, 2, 2,5, 5, 5, 5, 8, 8, 10, 10, 10, 14};

        //Brute force approach

        int totalNobles = 0;
        for (int i = 0; i < array.length; i++) {

            int smallerElementCount = 0;

            for (int j = 0; j < array.length; j++) {

                if (!(j == i)) {
                    if (array[j] < array[i]) {
                        smallerElementCount++;
                    }
                }
            }
            if (smallerElementCount == array[i]) {
                totalNobles++;
            }
        }
        System.out.println("Total Noble integers are " + totalNobles);

        // Optimized Approach
        totalNobles = 0;
        Arrays.sort(array);

        boolean countIncreased = false;
        for (int i = 0; i < array.length; i++) {

            // int[] array = {-3, 0, 2, 2, 5, 5, 5, 5, 8, 8, 10, 10, 10, 14};
            if (array[i] == i) {

                if(i>0 && array[i-1]==array[i]){
                    if(!countIncreased)continue;
                }
                totalNobles++;
                countIncreased=true;
            }
            else{

                if(i>0 && array[i-1]==array[i] && countIncreased){
                    totalNobles++;
                }else{
                    countIncreased=false;
                }
            }
        }
        System.out.println("Total Noble integers are " + totalNobles);


//        [8, 5, 4, 3, 1, -5, -10]
//        8 is not a noble integer
//        5 is a noble integer
//        4 is a noble integer
//        3 is a noble integer
//        1 is not a noble integer
//                -5 can never be a noble integer
//        -10 can never be a noble integer


    }
}
