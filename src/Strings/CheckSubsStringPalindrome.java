package Strings;

public class CheckSubsStringPalindrome {

    public static void main(String[] args) {
        String str="abcacbpcaccab";

        System.out.println(checkPalindrome(str,8,11));
        System.out.println(checkPalindrome(str,1,5));


    }

    private static boolean checkPalindrome(String str,int start,int end) {

        while(start<end){
            if(!(str.charAt(start)== str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
