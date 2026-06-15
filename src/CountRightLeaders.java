public class CountRightLeaders {
    public static void main(String[] args) {
        int [] ar={16,13,17,4,3,5,2,80,9};



        int maxRight=ar[ar.length-1];
        System.out.print(maxRight+" ");

        //brute force

//        for(int i=0;i<ar.length;i++){
//            int currentNumber=ar[i];
//            boolean isLeader=true;
//            for(int j=i+1;j<ar.length;j++){
//                if(!(currentNumber>ar[j])){
//                 isLeader=false;
//                 break;
//                }
//            }
//            if(isLeader){
//                System.out.print(currentNumber+" ");
//            }
//        }
        //optimized using carry forward

        for(int i=ar.length-2;i>=0;i--){
            if(ar[i]>maxRight){
                maxRight=ar[i];
                System.out.print(maxRight+" ");
            }
        }



    }
}


