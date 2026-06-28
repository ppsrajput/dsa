package OneDArray;

public class SubArrayQuestionBruteForce {
    public static void main(String[] args) {
        /*
        * Given an array of N integers, return the length of smallest sub array
        * which contains both max and min elements of the array
        * */

        // Brute Force Approach
        int[] array=new int[]{0,1,1,1,12,1};
       // int[] array=new int[]{1,2,3};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
//        System.out.println(max);
//        System.out.println(min);


       int answer=array.length;

       if(max!=min){
           for(int i=0;i<array.length;i++){
               for( int end=i;end<array.length;end++){
                   int[] subArray=new int[end-i+1];
                   int subArrayLength = subArray.length;
                   int subArrayIndex=0;
                   boolean maxExist=false;
                   boolean minExist=false;
                   System.out.print("{");


                   for(int x=i;x<=end;x++){

                       System.out.print(x==end?array[x]:array[x]+",");
                       subArray[subArrayIndex]=array[x];
                       subArrayIndex++;
                   }
                   System.out.print("}");
                   for(int i2=0;i2<subArrayLength;i2++){
                       if(subArray[i2]==max){
                           maxExist=true;
                       } if(subArray[i2]==min){
                           minExist=true;
                       }

                   }
                   if(maxExist && minExist){
                       if(subArrayLength<answer){
                           answer=subArrayLength;
                       }
                   }
                   System.out.println("");
               }
           }
           System.out.println("answer is "+answer);
       }else{
           System.out.println("answer is "+1);

       }



    }
}
