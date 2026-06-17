public class PrintSubArraySumOfAllSubArraysBruteForce {
    public static void main(String[] args) {
        int[] array={2,1,5,6,4,5};


        for(int s=0;s<array.length;s++){
            for (int e=s;e<array.length;e++){
                int sum=0;
                System.out.print("{");
                for(int i=s;i<=e;i++){
                    System.out.print(array[i]);
                    sum+=array[i];
                }
                System.out.print("} sum is " +sum );
                System.out.println("");
            }
        }

    }
}
