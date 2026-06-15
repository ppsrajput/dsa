public class CountLeftLeaders {
    public static void main(String[] args) {
        int [] ar={16,13,17,4,3,5,2,80,0};

//      int maxRight=ar[ar.length-1];
//      System.out.print(maxRight+" ");
//      brute force

        for(int i=ar.length-1;i>=0;i--){
            int currentNumber=ar[i];
            boolean isLeader=true;
            for(int j=i-1;j>=0;j--){
                if(!(currentNumber>ar[j])){
                 isLeader=false;
                 break;
                }
            }
            if(isLeader){
                System.out.print(currentNumber+" ");
            }
        }
        int maxLeft=ar[0];
        System.out.print(maxLeft+" ");
        //optimized using carry forward
                for(int i=1;i<ar.length;i++){
                    if(ar[i]>maxLeft){
                        maxLeft=ar[i];
                        System.out.print(maxLeft+" ");
                    }
          }



    }
}


