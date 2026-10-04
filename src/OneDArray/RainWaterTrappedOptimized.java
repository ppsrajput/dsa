package OneDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RainWaterTrappedOptimized {
    public static void main(String[] args) {
        int[] array={4,2,5,7,4,2,3,6,8,2,3};

        int[] leftMaxArray=new int[array.length];
        int[] rightMaxArray=new int[array.length];

        /*
        * leftMaxArray[i]=max(array[0],array[i-1])
        * leftMaxArray[i] = max(max(array[0],array[i-2]),array[i-1])
        * leftMaxArray[i-1]=max(array[0],array[i-1-1])
        * leftMaxArray[i-1]=max(array[0],array[i-2])
        * leftMaxArray[i] = max(leftMaxArray[i-1]),array[i-1])
        * */
        leftMaxArray[0]=0;
        for(int i=1;i<array.length;i++){
            leftMaxArray[i] = Math.max(leftMaxArray[i-1],array[i-1]);
        }
        System.out.println(Arrays.toString(leftMaxArray));

        /*
         * rightMaxArray[i]=max(array[i+1],array[n-1])
         * rightMaxArray[i] = max(array[i+1],max(array[i+2],array[n-1]))
         * rightMaxArray[i+1] = max(array[i+2],array[n-1])
         * rightMaxArray[i]=max(array[i+1],rightMaxArray[i+1]])
         * */
        rightMaxArray[array.length-1]=0;
        for(int i= array.length-2;i>=0;i--){
            rightMaxArray[i]=Math.max(array[i+1],rightMaxArray[i+1]);
        }
        System.out.println(Arrays.toString(rightMaxArray));
        int answer=0;
        for(int i=0;i< array.length;i++){
            int leftMax=Integer.MIN_VALUE;
            int rightMax=Integer.MIN_VALUE;
            int level;

//            for(int j=i-1;j>=0;j--){
//                if(leftMax<array[j]){
//                    leftMax=array[j];
//                }
//            }
//            for(int k=i+1;k< array.length;k++){
//                if(rightMax<array[k]){
//                    rightMax=array[k];
//                }
//            }
            level = Math.min(leftMaxArray[i], rightMaxArray[i]);

            if (array[i]<level) {
                answer+=level-array[i];
            }
        }
        System.out.println(answer);


    }
}
