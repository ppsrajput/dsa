package Strings;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String a="adaelcddfdcletggte";
        int answer=0;

        for(int s=0;s<a.length();s++){

            for(int e=s;e<a.length();e++){
                if(CheckSubsStringPalindrome.checkPalindrome(a,s,e) && (e-s+1)>answer)
                    answer=e-s+1;

            }

        }
        System.out.println("LongestPalindromeSubString length is "+answer);

        // TC is (N)3
    }
}
