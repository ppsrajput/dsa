package Sorting;

import java.util.Arrays;

public class CalculateNobleIntegers2 {
    /*An element in arr[] is said to be noble if {Count of smaller elements  = element itself}
    *
    * Constraint is all elements are distinct
     */


    public static void main(String[] args) {
        int[] array={1,-5,3,8,5,-10,4};

        //Brute force approach

        for(int i=0;i<array.length;i++){

                int smallerElementCount=0;

                for(int j=0;j<array.length;j++){

                    if(!(j==i)){
                        if(array[j]<array[i]){
                            smallerElementCount++;
                        }
                    }
                }
                if(smallerElementCount==array[i]){
                    System.out.println(array[i]+" is a noble integer");
                }else{
                    System.out.println(array[i]+" is not a noble integer");
                }

        }

        // Optimized Approach
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
       // ReverseArray.reverse(array,0,array.length-1);
        for(int i=0;i<array.length;i++){

                if(array[i]==i){
                    System.out.println(array[i]+" is a noble integer");
                }else{
                    System.out.println(array[i]+" is not a noble integer");
                }
            }


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
