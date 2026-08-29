import java.util.Arrays;

public class SortArrayUsingSelectionSOrt {
    public static void main(String[] args) {

        int[] array={2,5,3,7,9,6,8,1,4,6,2,4,8,5,3};

        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
