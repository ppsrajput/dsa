package InterviewProblems;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int x2 = x;


        int answer = 0;

        while (x2 > 0) {
            int r = 0;
            r = x2 % 10;
            x2 = x2 / 10;
            answer = (answer * 10) + r;
        }
        if (x >= 0) {
            System.out.println("answer" + answer);
        } else {
            answer = answer - (2 * answer);
            System.out.println("answer" + answer);
        }

    }
}
