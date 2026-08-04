package TwoDArray;

public class PrintAllAntiDiagnoalsInAMatrix {

    public static void main(String[] args) {
        int[][] ar=new int[][]{
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15 },
                {16,17,18,19,20 },
        };
        int rowC=ar.length;int colC=ar[0].length;
        System.out.println(rowC+""+colC);



        for(int j=0;j<colC;j++){

           int row=0;
           int col=j;
           while(row<rowC  && col>=0){
               System.out.print(ar[row][col]);
               row++;col--;
           }
            System.out.println();
        }

        for(int i=1;i<rowC;i++){

            int row=i;
            int col=colC-1;
            while(row<rowC  && col>=0){
                System.out.print(ar[row][col]);
                row++;col--;
            }
            System.out.println();
        }
    }
}
