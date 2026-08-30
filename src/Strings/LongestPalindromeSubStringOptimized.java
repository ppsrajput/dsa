package Strings;

public class LongestPalindromeSubStringOptimized {
    public static void main(String[] args) {
        String a="adaelcdfdcletggte";
        int answer=0;
        if(a!=null && !a.isEmpty()){
            answer=1;
        }
        // abcba


       if(a!=null)
       {
           int center=1;
           while (center<a.length()-1){
               if (a.charAt(center)==a.charAt(center+1)) {
                   if (answer < 2) {
                       answer = 2;
                   }
                   int x=center-1;
                   int y=center+2;
                   while (x>=0 && y<a.length()){
                       if(!(a.charAt(x)==a.charAt(y))){
                           break;
                       }
                       if(answer<y-x+1){
                           answer=y-x+1;
                       }
                       x--;
                       y++;
                   }
               }
               center++;
           }
           center=1;

           while (center<a.length()){
               int x=center-1;
               int y=center+1;
               while (x>=0 && y<a.length()){
                   if(!(a.charAt(x)==a.charAt(y))){
                       break;
                   }
                   if(answer<y-x+1){
                       answer=y-x+1;
                   }
                   x--;
                   y++;
               }
               center++;
           }
           System.out.println("LongestPalindromeSubString length is "+answer);
       }else {
           System.out.println("LongestPalindromeSubString length is "+answer);
       }
        // TC is (N)2
    }
}
