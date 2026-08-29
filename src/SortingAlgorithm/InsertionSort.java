package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] array = new int[]{5, 7, 1, 10, 4, 8, 3, 9, 2, 6};
        int[] array = new int[]{1,2,3,4};


        System.out.println("Before Sort " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }else{
                    break;
                }
            }


        }
        System.out.println("After Sort " + Arrays.toString(array));
    }

    private static void swap(int[] array, int smallIndex, int i) {
        int temp = array[smallIndex];
        array[smallIndex] = array[i];
        array[i] = temp;
    }
}
