import java.util.Arrays;

public class SortArrayUsingInsertionSort {
    public static void main(String[] args) {

        int[] array={1,2,3};

        for(int i=1;i<array.length;i++){
            for(int j=i-1;j>=0;j--){
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));



    }
}
