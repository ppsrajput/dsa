package TwoDArray;

public class PrintSquareMatrixDiagonalAndSum {
    public static void main(String[] args) {
        int[][] arr={
                {1,5,8,7},
                {2,11,3,9},
                {15,20,-3,18},
                {30,40,50,60}
        };

        //Principal Diagonal
        System.out.println("Principal Diagonal");
        int principalDiagonalSum=0;
        int principalAntiDiagonalSum=0;
        for(int i=0;i<arr.length;i++){
            principalDiagonalSum+=arr[i][i];
            System.out.print(arr[i][i]+",");
        }
        System.out.println("principalDiagonalSum= "+principalDiagonalSum);

        //Principal Anti Diagonal
        System.out.println();
        System.out.println("Principal Anti Diagonal");
        for(int i=0;i<arr.length;i++){
            principalAntiDiagonalSum+=arr[i][arr.length-1-i];
            System.out.print(arr[i][arr.length-1-i]+",");
        }
        System.out.println("principalAntiDiagonalSum= "+principalAntiDiagonalSum);




    }
}
