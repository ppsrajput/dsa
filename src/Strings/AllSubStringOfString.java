package Strings;

public class AllSubStringOfString {
    public static void main(String[] args) {
        String a="ABC";


        for(int s=0;s<a.length();s++){

            for(int e=s;e<a.length();e++){
                String subString="";
                for(int i=s;i<=e;i++){
                    subString=subString+a.charAt(i);
                }
                System.out.println(subString);

            }

        }

    }
}
