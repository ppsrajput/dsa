import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CheckPrime {
    public static void main(String[] args) {
        int num=234328768;
        boolean isPrime=checkPrime(234328768,true);
        System.out.println(num +" is prime "+isPrime);

    }

    private static boolean checkPrime(int i, boolean b) {
        int factors= factors(i,b);
        return factors==2;
    }

    private static int factors(Integer num,boolean optimized){
        LocalDateTime startTime=LocalDateTime.now();
        int count=0;
        String approach="";
        if (optimized) {
            approach="Optimized";
            for(int i=1;(i*i)<=num;i++){
                if(num%i==0){
                    if (num/i==i) {
                        count++;
                    }else{
                        count++;count++;
                    }

                }
            }
        }else{
            approach="Non-Optimized";
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
        }

        LocalDateTime endTime=LocalDateTime.now();
        long seconds = ChronoUnit.MILLIS.between(startTime, endTime);
        System.out.println("Time taken is "+seconds+" milli seconds in "+approach+" approach");
        return count;
    }


}