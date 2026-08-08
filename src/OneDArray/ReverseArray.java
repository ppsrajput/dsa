package OneDArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{4,3,2,1};
        reverse(array, 0, array.length - 1);

    }
   public static void reverse(int[]array , int start, int end){
        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
