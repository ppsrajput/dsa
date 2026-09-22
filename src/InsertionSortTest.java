import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] array={2,4,7,3,5,3,6,3,1,6,3,4,2,6,9,0};
        System.out.println(Arrays.toString(array));

        for (int i=1;i< array.length;i++){
            for(int j=i-1;j>=0;j--){
                if (array[j]>array[j+1]) {
                    int temp;
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }else{
                    break;
                }
            }
        }System.out.println(Arrays.toString(array));
    }
}
