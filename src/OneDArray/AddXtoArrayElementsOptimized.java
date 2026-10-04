package OneDArray;

import java.util.Arrays;

public class AddXtoArrayElementsOptimized {
    public static void main(String[] args) {
        /*Given an integer array A where every element is 0 .
         Return the final array after performing multiple queries
         Query(i,x): Add x to all elements from i to N-1;
         */


        int[] array={0,0,0,0,0,0,0};

        int[][] queries={
                {1,3},
                {4,-2},
                {3,1},
                {3,2}
        };
        for(int i=0;i< queries.length;i++){
            int index=queries[i][0];
            int value=queries[i][1];

            array[index]+=value;
        }
        int[] pfArray=new int[array.length];
        pfArray[0]=array[0];
        for(int i=1;i< pfArray.length;i++){

            pfArray[i]=pfArray[i-1]+array[i];
        }
        System.out.println(Arrays.toString(pfArray));
    }
}
