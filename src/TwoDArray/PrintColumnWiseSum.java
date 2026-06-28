package TwoDArray;

public class PrintColumnWiseSum {
    public static void main(String[] args) {
        int[][] arr = {
                {10,2,7,3},
                {9,5,-1,8},
                {3,11,15,20}
        };
        int rows = arr.length;
        int columns = arr[0].length;

        for(int col=0;col<columns;col++){
            int sum=0;
            for(int row=0;row<rows;row++){
                sum+=arr[row][col];
            }
            System.out.println("Sum of all elements in column "+ (col+1) +" is "+sum);
        }


    }
}
