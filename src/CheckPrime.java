import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CheckPrime {
    public static void main(String[] args) {
        Long num=23432876888L;
        boolean optimizedApproach=false;
        boolean isPrime=checkPrime(num,optimizedApproach);
        if (isPrime) {
            System.out.println(num +" is prime number");
        }else{
            System.out.println(num +" is prime not number");
        }

    }

    private static boolean checkPrime(Long number, boolean optimizedApproach) {
        int factors= factors(number,optimizedApproach);
        return factors==2;
    }

    private static int factors(Long num,boolean optimized){
        LocalDateTime startTime=LocalDateTime.now();
        int count=0;
        String approach="";
        System.out.println("Program is running");
        if (optimized) {
            approach="Optimized";
            for(Long i=1L;(i*i)<=num;i++){
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
            for(Long i =1l;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
        }

        LocalDateTime endTime=LocalDateTime.now();
        long seconds = ChronoUnit.MILLIS.between(startTime, endTime);
        System.out.println("Time taken is "+seconds+" milli seconds in "+approach+" approach");
        System.out.println("Program is completed");
        return count;
    }


}