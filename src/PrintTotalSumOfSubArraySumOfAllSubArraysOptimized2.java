import java.util.Arrays;

public class PrintTotalSumOfSubArraySumOfAllSubArraysOptimized2 {

    public static void main(String[] args) {
       // int[] array={3,2,5};
        int[] array={1,2};
        int length=array.length;
        //{3,5,10}
        int totalSubArray=(array.length*(array.length+1))/2;
        System.out.println(totalSubArray);
        int[] pf=new int[array.length];
        int summ=0;
        for(int i=0;i<array.length;i++){

            summ=summ+array[i];
            pf[i]=summ;
        }
        System.out.println(Arrays.toString(pf));


        int x=length;
        int s=0;
        int e=0;
        int counter=1;
        int sum=0;
        int total=0;
        for(int i=1;i<=totalSubArray;i++)
        {


            if((!(counter%x==0))){
                counter++;

                if(s==e){
                    sum=array[s];
                    total+=sum;
                }else{
                    if(s==0){
                        sum=pf[e];
                        total+=sum;
                    }else{
                        sum=(pf[e]-pf[s-1]);
                        total+=sum;
                    }
                }
                e++;

            }else{
                x--;

                counter=1;
                if(s==e){
                    sum=array[s];
                    total+=sum;
                }else{
                    if(s==0){
                        sum=pf[e];
                        total+=sum;
                    }else{
                        sum=(pf[e]-pf[s-1]);
                        total+=sum;
                    }
                }

                s++;
                e=s;
            }
            System.out.println("sum is "+sum);
        }
        System.out.println("total sum is "+total);
        ///  TC is still Big(N^2)

    }
}
