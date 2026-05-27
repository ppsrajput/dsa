public class SubArrays {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
       // printSubArray(array,0,2);
        //print all sub arrays of the above array
//        System.out.println("All sub arrays for "+ Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            //printSubArray(array,i,array.length-1);

           // withLength(i, array);
            withStartEndIndcies( array,i);

        }
    }

    private static void withLength(int start, int[] array) {
        for(int p = start; p< array.length; p++){
            System.out.print("{");
            for(int q = start; q<=p; q++){

                System.out.print(q!=p?array[q]+",":array[q]);

            }
            System.out.print("}");
            System.out.println("");
        }
    }

    private static void withStartEndIndcies(int[] array, int start){

        for(int end=start;end<array.length;end++){
            System.out.print("{");
            for (int i=start;i<=end;i++){
                System.out.print(i!=end?array[i]+",":array[i]);
            }
            System.out.print("}");
            System.out.println("");

        }

    }


}
