package OneDayArray;

public class CheckMaxSumSubArrayOfLengthKBruteForce {

    public static void main(String[] args) {
       int[] array={-3,4,-2,5,3,-2,8,2,-1,4};
       int k=5;
      int maxSum=Integer.MIN_VALUE;
//       for(int i=0;i<array.length-k;i++){
//           int sum=0;
//           for(int j=i;j<=i+k-1;j++){
//               sum+=array[j];
//           }
//           if(maxSum<sum){maxSum=sum;}
//       }
//        System.out.println(maxSum);

        int s=0;
        int e=k-1;
        while(e<array.length){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=array[i];
        }
        if(maxSum<sum){maxSum=sum;}

        s++;e++;
        }
        System.out.println(maxSum);


    }
}
