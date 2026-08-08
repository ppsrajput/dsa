package Sorting;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Given N Elements, at every step remove an array element
* Cost to remove an element = SUm of array of elements present in an array
* Find Minimum cost to remove all elements
*/
public class CalculateMinimumCostToEmptyAnArray {

    public static void main(String[] args) {

        int[] array={2,1,4};//4,2,1
        //4,2,1
        //2,1
        //1



        Arrays.sort(array);System.out.println(Arrays.toString(array));
        int totalCost=0;

        int multiplier = array.length;
        for(int i = 0; i< array.length; i++){
            totalCost=totalCost+(array[i]*multiplier);
            multiplier--;
        }
        System.out.println("Minimum cost to remove all elements is "+totalCost);

    }
}
