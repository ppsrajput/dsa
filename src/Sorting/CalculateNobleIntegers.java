package Sorting;

import OneDArray.ReverseArray;

import java.util.Arrays;

public class CalculateNobleIntegers {
    /*An element in arr[] is said to be noble if {Count of smaller elements  = element itself}
    *
    * Constraint is all elements are distinct
     */


    public static void main(String[] args) {
        int[] array={1,-5,3,8,5,-10,4};

        //Brute force approach

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                System.out.println(array[i]+" can never be a noble integer");
            }else{
                int smallerElementCount=0;
                if(array[i]>array.length-1){
                    System.out.println(array[i]+" is not a noble integer");
                    continue;
                }
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
        }

        // Optimized Approach
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        ReverseArray.reverse(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                System.out.println(array[i]+" can never be a noble integer");
            }else{
                if(array[i]>array.length-1){
                    System.out.println(array[i]+" is not a noble integer");
                    continue;
                }
                if(array[i]==(array.length-(i+1))){
                    System.out.println(array[i]+" is a noble integer");
                }else{
                    System.out.println(array[i]+" is not a noble integer");
                }
            }
        }



    }
}
