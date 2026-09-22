package InterviewProblems;

public class Question3Optimized {
    public static void main(String[] args) {
        // Given array [N]. Find the majority element
        // Elements which exists more than N/2 times.

        // BF

        int[] array={1,3,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int mgI=0;
        int count=1;
        for(int i=1;i<array.length;i++){
            if(count==0){
                mgI=i;
                count=1;
            }else{
                if(array[mgI]==array[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        System.out.println(array[mgI]);
        int x=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==array[mgI])x++;
        }
        if(x>(array.length/2)){
            System.out.println("Majority element is "+array[mgI]);
        }else{
            System.out.println("No Majority element found");
        }

    }
}
