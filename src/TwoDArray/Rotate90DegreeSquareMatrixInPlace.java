package TwoDArray;

public class Rotate90DegreeSquareMatrixInPlace {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        System.out.println("Original Matrix ");
        print(arr);
        System.out.println("Transposed Matrix ");
        transpose(arr);
        print(arr);
        System.out.println("90 Degree Rotated Matrix ");
        reverseRows(arr);
        print(arr);

    }

    private static void reverseRows(int[][] arr) {
        for(int i=0;i< arr.length;i++){
            reversRow(arr[i],0,arr[i].length-1);
        }
    }

    private static void reversRow(int[] arr, int start, int end) {
        for(int i=start;i<=end;i++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }

    private static void print(int[][] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
