import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        System.out.println(92^154);
        int maxProfit=0;

        int[] prices={3,3,5,0,0,3,1,4};

        int originalArrayLength=prices.length;

        int lowestPrice=Integer.MAX_VALUE;
        int lowestPriceDay=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowestPrice){lowestPrice=prices[i];lowestPriceDay=i+1;}
        }
        System.out.println("Lowest price is "+lowestPrice+" on day "+lowestPriceDay);

        int[] newArray=new int[originalArrayLength-lowestPriceDay];
        for(int i=lowestPriceDay;i<originalArrayLength;i++){
            newArray[i-lowestPriceDay]=prices[i];
        }
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(newArray));

        int  maxPrice=Integer.MIN_VALUE;
        for(int i=0;i<newArray.length;i++){
            if(newArray[i]>maxPrice){
                maxPrice=newArray[i];
            }
        }
        if(lowestPrice<maxPrice){
            for(int i=0;i<newArray.length;i++){
                int currentMaxPrice=0;
                if(newArray[i]>lowestPrice && newArray[i]<maxPrice){
                    currentMaxPrice=newArray[i];
                }
                if(newArray[i]<maxPrice){

                }
            }
        }

    }
}
