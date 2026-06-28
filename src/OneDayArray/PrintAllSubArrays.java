package OneDayArray;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] array={3,2,5};


        int k=2;
        int totalKLengthSubArrays=0;
        for(int s=0;s<array.length;s++){
            for (int e=s;e<array.length;e++){
                System.out.print("{");
                int count=0;
                int sum=0;
                for(int i=s;i<=e;i++){
                    System.out.print(array[i]);
                    sum+=array[i];
                    count++;
                }
                if(k==count){
                    totalKLengthSubArrays++;
                }
                System.out.print("} = "+sum);
                System.out.println("");
            }
        }
        System.out.println("totalKLengthSubArrays : "+totalKLengthSubArrays);



    }
}
