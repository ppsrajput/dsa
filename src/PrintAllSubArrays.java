public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] array={3,2,5,1,6,8,10};


        int k=1;
        int totalKLengthSubArrays=0;
        for(int s=0;s<array.length;s++){
            for (int e=s;e<array.length;e++){
                System.out.print("{");
                int count=0;
                for(int i=s;i<=e;i++){
                    System.out.print(array[i]);
                    count++;
                }
                if(k==count){
                    totalKLengthSubArrays++;
                }
                System.out.print("}");
                System.out.println("");
            }
        }
        System.out.println("totalKLengthSubArrays : "+totalKLengthSubArrays);



    }
}
