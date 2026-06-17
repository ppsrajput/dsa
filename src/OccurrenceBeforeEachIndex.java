public class OccurrenceBeforeEachIndex {
    public static void main(String[] args) {

        String str="abacabaabacabaabacaba";

        // 0-0,1-1,2-1,3-2,4-2,5,3,6,3
        int answer=0;

        char[] charArray = str.toCharArray();
       // brute force approach with TC N^2
        for(int i = 1; i< charArray.length; i++){
            int aCount=0;

            for(int j=0;j<i;j++){
                if(charArray[j]=='a')aCount++;
            }
            System.out.println("a count before index "+i+" is "+aCount);
        }
        // optimized approach
        int aCount=0;
        for(int i = 1; i< charArray.length; i++){
            if(charArray[i-1]=='a') aCount++;
            System.out.println("a count before index "+i+" is "+aCount);
        }



    }
}
