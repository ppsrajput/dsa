package Strings;

import java.util.Arrays;

public class UpperCaseToLowerCaseAndLowerCaseToUpperCase {
    public static void main(String[] args) {
        String a="Hello";



        char[] array=a.toCharArray();
        System.out.println(Arrays.toString(array));
        // convert all lower case to upper case and upper case to lower case
        
        // 65 - upper case
        // 97 - lower case
        int count=0;
        for(char c:array){
            int ascii=c;
            if(c<=90 && c>=65){
                ascii=ascii+32;
                array[count]= (char) ascii;
              //  b=b+(char) ascii;
            } else if (c<=122 && c>=97) {
                ascii=ascii-32;
                array[count]= (char) ascii;
               // b=b+(char) ascii;
            }
            count++;
        }
        System.out.println(Arrays.toString(array));
    }
}
