package OneDayArray;

public class PrintTotalSumOfSubArraySumOfAllSubArraysBruteForce {

    public static void main(String[] args) {
        int[] array={3,2,5};

        int totalSum=0;
        for(int s=0;s<array.length;s++){
            for (int e=s;e<array.length;e++){
                int sum=0;
                System.out.print("{");
                for(int i=s;i<=e;i++){
                    System.out.print(array[i]);
                    sum+=array[i];
                }
                System.out.print("} sum is " +sum );
                totalSum+=sum;
                System.out.println("");
            }
        }
        System.out.println("totalSum "+totalSum);
        ///  TC is  Big(N^3)
    }
}
