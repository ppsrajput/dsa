import java.util.Arrays;

public class UniquqElement {
    public static void main(String[] args) {
        int[] ar=new int[]{4,1,2,1,1,2,4,3};

        int ans=0;
        for(int i :ar){
            ans=ans^i;
        }
        System.out.println(ans);



     }
}
