package numbers;

public class BinaryToDecimal {
    public static void main(String[] args) {


        int bin=10;

        int dec=0;

        int count=0;

        while(bin>0){
            int i = bin % 10;
            bin=bin/10;
            if(i!=0){
                if(count==0){
                    dec+=1;
                }else{
                    int x=1;
                    for(int j=1;j<=count;j++){
                        x=2*x;
                    }
                    dec=dec+x;
                }
            }
            count++;


        }
        System.out.println(dec);
    }
}
