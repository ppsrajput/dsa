package leet;

public class NumberAscii {
    public static void main(String[] args) {
        String s = "21474836489";

        System.out.println(convertStringToNumber(s));
    }

    private static int convertStringToNumber(String s) {
        String input = s.trim();

        if(input.length()==0){
            return 0;
        }


        boolean isNegative = input.charAt(0) == '-';
        boolean isPositive = input.charAt(0) == '+';

        if(!isNegative){
            isPositive=true;
        }
        int answer = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            int i1 = input.charAt(i);
            if (i1 <= 57 && i1 >= 48) {
                int num = i1 - 48;
                System.out.println("Ascii value of " + input.charAt(i) + " is " + i1);

                if(answer>Integer.MAX_VALUE/10 || (answer==(Integer.MAX_VALUE/10)&& num>7)){
                    if (isNegative) {
                        answer=Integer.MIN_VALUE;
                    }else{
                        answer=Integer.MAX_VALUE;
                    }
                    break;
                }


                if(answer<Integer.MIN_VALUE/10 || (answer==Integer.MIN_VALUE/10 && num<-8)){
                    if (isNegative) {
                        answer=Integer.MIN_VALUE;
                    }else{
                        answer=Integer.MAX_VALUE;
                    }
                    break;
                }

                answer = (answer * 10) + num;




            } else if(!((input.charAt(i)=='-' || input.charAt(i)=='+')&& i==0) ){
               break;

            } else {
                continue;
            }
        }
        if (isNegative) {
            answer = -answer;
        }

        System.out.println(answer);
        return answer;
    }
}












/*
* -6
*
* -5
*
*
*
*
* */
