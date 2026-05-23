import java.util.Arrays;
import java.util.Random;

public class PrefixSumArray {
    public static void main(String[] args) {

        int[][] quries = new int [10][2];
        int[] ar={1,2,3,4,5,6,7,8,9,10};



        for(int i=0;i<10;i++){
            Random random = new Random();
            int first = random.nextInt(9);
            int second = random.nextInt(10 - first) + first;

            quries[i][0]=first;
            quries[i][1]=second;
        }
        sumOfFromAndToIndices(true,ar,quries);
     }

     public static void sumOfFromAndToIndices(boolean optimized,int[] ar,int[][] queries){
         if (optimized) {
             int[] pfsarray=new int[ar.length];
             pfsarray[0] = ar[0];
             for(int i=1;i<ar.length;i++){
                 pfsarray[i]=pfsarray[i-1]+ar[i];
             }
             System.out.println(Arrays.toString(pfsarray));
             for(int i=0;i<10;i++){
                 int sum=0;
                 int start;
                 int end;
                 start=queries[i][0];
                 end=queries[i][1];

                 System.out.println("Sum from "+start+" to "+end+" is "+(start==0?(pfsarray[end]):pfsarray[end]-pfsarray[start-1]));
             }
         }else {

             for(int i=0;i<10;i++){
                 int sum=0;
                 int start;
                 int end;
                 start=queries[i][0];
                 end=queries[i][1];
                 for(int j=start;j<=end;j++){
                     sum+=ar[j];
                 }
                 System.out.println("Sum from "+start+" to "+end+" is "+sum);

             }
         }
     }
}

