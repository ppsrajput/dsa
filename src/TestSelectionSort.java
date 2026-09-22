import java.util.Arrays;

public class TestSelectionSort {
    public static void main(String[] args) {
        int[] array={2,4,7,3,5,3,6,3,1,6,3,4,2,6,9,0};
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[j]>array[i]) {
                    int temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
