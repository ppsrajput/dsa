package OneDayArray;

public class CarryForwardExample {
    public static void main(String[] args) {

        String str="gsdagadfgdfaggad";

        // FIND COUND OF ag PAIRS;


        //brute force approach


        char[] array=str.toCharArray();


        int answer=0;
        for(int i=0;i<array.length;i++){
            if(array[i]=='a'){
                for(int j=i+1;j<array.length;j++){
                    if(array[j]=='g'){
                       answer++;
                    }
                }
            }
        }
        System.out.println(answer);
         answer=0;
        // optimized approach
        int aCount=0;
        for(int i=0;i<array.length;i++){
            if(array[i]=='a'){
                aCount++;
            }
            if(array[i]=='g'){
                answer=answer+aCount;
            }
        }
        System.out.println(answer);



    }
}
