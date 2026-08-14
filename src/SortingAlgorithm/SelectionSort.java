package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array=new int[] {5,6,4,2,2,4,6,2,5,7,2,5,7,4,67,4,67,4};


        System.out.println("Before Sort "+ Arrays.toString(array));
        for(int i=0;i<array.length-1;i++){
            int smallestIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[smallestIndex]){
                    smallestIndex=j;
                }
            }
            int temp=array[smallestIndex];
            array[smallestIndex]=array[i];
            array[i]=temp;
        }
        System.out.println("After Sort "+ Arrays.toString(array));
    }
}
