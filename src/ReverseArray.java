import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(array, 0, array.length - 1);

    }
   static void reverse(int[]array , int start, int end){
        for(int i=start;i<=end-1;i++){
            int temp;
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;


        }
       // System.out.println(Arrays.toString(array));
    }
}
