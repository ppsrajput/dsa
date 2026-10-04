package InterviewProblems;

public class ReverseInteger2 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }

    public static int reverse(int x) {


        long answer = 0;


        while (x != 0) {
            int r = 0;
            r = x % 10;
            x = x / 10;
            answer = (answer * 10) + r;
        }

        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0;
        }
        {
            return (int) answer;
        }

    }
}
