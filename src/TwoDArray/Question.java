package TwoDArray;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        /*
        * Given an MxN Matrix
        * wherever 0 is found update all the elements as 0 in corresponding row and column

       e.g
       Input 1,2,3
             6,2,3
             1,0,2
       Output 1,0,3
              6,0,3
              0,0,0


        * */

        int[][] array={
                {1,2,3},
                {6,2,3},
                {1,0,2}
        };

        int[] rows=new int[array.length];
        int[] cols=new int[array[0].length];
        System.out.println("Before");
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
//        System.out.println(Arrays.toString(rows));
//        System.out.println(Arrays.toString(cols));

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(rows[i]==1){
                    array[i][j]=0;
                }
                if(cols[j]==1){
                    array[i][j]=0;
                }
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));

    }
}
