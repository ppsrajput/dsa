package OneDArray;

import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        //5,4,3,2,1
        //5,1,2,3,4
        //4,5,1,2,3
        int k=2;
        k=k%array.length;
        if (k!=0) {
            rotate(array,k,false);
        }


    }
   static void rotate(int[]array , int k, boolean optimizedApproach){
       if (optimizedApproach) {
           int start=array.length-k-1;
           int end=array.length-1;

           ReverseArray.reverse(array,0,array.length-1);
           ReverseArray.reverse(array,0,k-1);
           ReverseArray.reverse(array,k,array.length-1);
           System.out.println(Arrays.toString(array));
       }else{
           //1,2,3,4,5
           //5,1,2,3,4
           //4,5,1,2,3
           System.out.println(Arrays.toString(array));
           for(int i=0;i<k;i++){

               int last=array[array.length-1];
               for(int x=array.length-1;x>0;x--){
                   array[x]=array[x-1];
               }
               array[0]=last;


           }
           System.out.println(Arrays.toString(array));

       }


   }
}
