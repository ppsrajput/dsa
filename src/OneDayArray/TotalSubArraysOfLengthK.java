package OneDayArray;

public class TotalSubArraysOfLengthK {

    public static void main(String[] args) {
       int[] array={-3,4,-2,5,3,-2,8,2,-1,4};
       int k=5;
       //optimized approach
        System.out.println("Total sub arrays of length "+k +" is "+(array.length-k+1));


        System.out.println("print all sub arrays with length "+k);
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=array.length-k;i++){
            int sum=0;
            System.out.print("{");

            for(int j=i;j<i+k;j++){
                sum+=array[j];
                 if (j==i+k-1) {
                    System.out.print(array[j]);

                }else if (j<i+k) {
                    System.out.print(array[j]+",");

                }
            }
            System.out.print("} = "+sum);
            if(sum>maxSum){maxSum=sum;}
            System.out.println();
        }
        System.out.println("maxSum "+maxSum);



    }
}
