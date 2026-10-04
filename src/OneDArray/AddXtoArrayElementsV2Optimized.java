package OneDArray;

import java.util.Arrays;

public class AddXtoArrayElementsV2Optimized {
    public static void main(String[] args) {
        /*
         Given an integer array A where every element is 0 .
         Return the final array after performing multiple queries
         Query(i,j,x): Add x to all elements from i to j ;
         */


        int[] array={0,0,0,0,0,0,0};

        int[][] queries={
                {1,3,2},
                {2,5,3},
                {5,6,-1}
        };
        for(int i=0;i< queries.length;i++){
            int i1=queries[i][0];
            int j1=queries[i][1];
            int value=queries[i][2];

            array[i1]=array[i1]+value;
            if ((j1+1)<array.length) {
                array[j1+1]=array[j1+1]-value;
            }

        }

        System.out.println(Arrays.toString(array));
        int[] pfArray=new int[array.length];
        for(int i=1;i< pfArray.length;i++){

            pfArray[i]=pfArray[i-1]+array[i];
        }
        System.out.println(Arrays.toString(pfArray));
        // TC is QN
    }
}
