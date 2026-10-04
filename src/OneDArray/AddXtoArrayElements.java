package OneDArray;

import java.util.Arrays;

public class AddXtoArrayElements {
    public static void main(String[] args) {
        /*Given an integer array A where every element is 0 .
         Return the final array after performing multiple queries
         Query(i,x): Add x to all elements from i to N-1;
         */


        int[] array={0,0,0,0,0,0,0};
        // 0,3,3,3,3,3,3
        // 0,3,3,3,1,1,1
        // 0,3,3,4,2,2,2
        int[][] queries={
                {1,3},
                {4,-2},
                {3,1}
        };
        for(int i=0;i< queries.length;i++){
            int index=queries[i][0];
            int value=queries[i][1];

            for(int j=0;j< array.length;j++){
                if(j>=index){
                    array[j]=array[j]+value;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        // TC is QN
    }
}
