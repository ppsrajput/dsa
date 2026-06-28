package OneDArray;

public class TotalSubArraysOfLengthKBruteForce {

    public static void main(String[] args) {
       int[] array={3,2,5,1,6,8,10};
       int k=4;

       int answer=0;

       for(int i=0;i<=array.length-k;i++){

//           for(int j=i;j<i+k;j++){
//               System.out.print(array[j]+" ");
//           }
           answer++;
           System.out.println();

       }
        System.out.println("Total sub arrays of length K is "+answer);




    }
}
