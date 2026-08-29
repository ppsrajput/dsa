package leet;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight",""};

        int smallestStringIndex = 0;
        int minLength = Integer.MAX_VALUE;
        int counter = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                smallestStringIndex = i;
            }
        }
        System.out.println(strs[smallestStringIndex]);
        String commonPrefix = strs[smallestStringIndex];
        counter = minLength;
        String output="";

        while (counter > 0) {
            int x = 0;
            String substring = commonPrefix.substring(0, counter );
            for (int i = 0; i < strs.length; i++) {


                if (strs[i].startsWith(substring)) {
                    x++;
                }

            }
            if(!(x==strs.length)){
                counter--;
            }else{
                output=substring;
                break;
            }

        }


        System.out.println("commonPrefix is " + output);
        System.out.println("minLength is " + minLength);


    }
}
