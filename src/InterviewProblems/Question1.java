package InterviewProblems;

public class Question1 {
    public static void main(String[] args) {
        /*
        * Given a binary array[]. We can atmost replace a single 0 with 1. FInd the maximum
        * consecutive 1's we can get in the array[] after the replacement
        */


       // int[] array={0,1,1,1,0,1,1,0,1,1,0};
        int[] array={1,1,1,0,1,1,1};
        int answer=0;
        int zeros=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                zeros++;
                int left1s=0;
                int right1s=0;
                if (i>0){
                    int j=i-1;
                    while (j>=0 && array[j]==1){
                        j--; left1s++;
                    }

                }
                if(i< array.length-1){
                    int j=i+1;
                    while ( j<array.length && array[j]==1 ){
                        j++; right1s++;
                    }
                }
                if(answer<(left1s+right1s+1))
                    answer=left1s+right1s+1;
            }
        }
        if (zeros>0) {
            System.out.println("Answer is "+answer);
        }else{
            System.out.println("Answer is "+array.length);
        }
    }
}
