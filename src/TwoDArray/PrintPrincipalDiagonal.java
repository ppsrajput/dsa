package TwoDArray;

public class PrintPrincipalDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int row= arr.length;
        int col= arr[0].length;
        System.out.println(row+""+col);
        for(int i=0;i< row;i++){

                   System.out.println(arr[i][i]);

           }




    }
}
