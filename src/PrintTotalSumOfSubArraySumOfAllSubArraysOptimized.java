public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimized {

    public static void main(String[] args) {
        int[] array={3,2,5};

        int totalSum=0;
        for(int s=0;s<array.length;s++){
            for (int e=s;e<array.length;e++){
                int sum=0;
                totalSum+=array[e];
            }
        }
        System.out.println("totalSum "+totalSum);
    }
}
