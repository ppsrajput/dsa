package OneDArray;

import java.util.Arrays;

public class FindSubArrayHavingMaxSum {
    public static void main(String[] args) {
        int[] array={-20,10,-20,-12,6,5,-3,8,-2};

        int[] pfArray=new int[array.length];

        int x=0;
        for(int i=0;i<array.length;i++){
            x+=array[i];
            pfArray[i]=x;
        }
      System.out.println(Arrays.toString(pfArray));
        int maxSubArraySum=Integer.MIN_VALUE;
        for(int s=0;s< array.length;s++){
            int sum=0;
            for(int end=s;end< array.length;end++){
                if (s==0) {
                    sum=pfArray[end];
                }else{
                    sum=pfArray[end]-pfArray[s-1];
                }
//                Using Prefix Sum Array
//                if(s==0){
//                    sum+=array[end];
//                }else{
//                    sum=pfArray[end]-pfArray[s-1];
//               }
//              Using Carry Forward Technique
            //  sum+=array[end];
                System.out.println("sum from index "+s+" to "+end+" is "+sum);
                if(maxSubArraySum<sum){
                    maxSubArraySum=sum;
                }
            }
        }
        System.out.println("max sum of sub array is "+maxSubArraySum);
    }
}
