package TwoDArray;

public class PrintRowWiseSum {
    public static void main(String[] args) {
        int[][] arr = {
                {10,2,7,3},
                {9,5,-1,8},
                {3,11,15,20}
        };
        int rows = arr.length;
        int columns = arr[0].length;

        for(int row=0;row<rows;row++){
            int sum=0;
            for(int col=0;col<columns;col++){
                sum+=arr[row][col];
            }
            System.out.println("Sum of all elements in row "+ (row+1) +" is "+sum);
        }


    }
}
