package InterviewProblems;

public class Question3 {
    public static void main(String[] args) {
        // Given array [N]. Find the majority element
        // Elements which exists more than N/2 times.

        // BF

        int[] array={1,0,0,1};
        int x=0;

       int  expectedOccurrence=(array.length/2)+1;
        System.out.println(array.length);
        System.out.println(expectedOccurrence);

        for(int i=0;i<array.length;i++){
            x=1;
            for(int j=i+1;j< array.length;j++){
                if(array[j]==array[i]){
                    x++;
                }
            }
            if(x>=expectedOccurrence){
                System.out.println("Majority element is "+array[i]);
                break;
            }
            x=0;
        }
        if(x<expectedOccurrence){
            System.out.println("No Majority element found.");
        }
    }
}
