package OneDArray;

public class PrintSubArraySumOfAllSubArraysOptimized {
    public static void main(String[] args) {
        int[] array={1,2,3};


        for(int s=0;s<array.length;s++){
            int sum=0;
            for (int e=s;e<array.length;e++){
                sum=sum+array[e];
                System.out.println(sum);
            }
           // System.out.println(sum);
        }

    }
}
