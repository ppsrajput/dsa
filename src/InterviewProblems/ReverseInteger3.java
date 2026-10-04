package InterviewProblems;

public class ReverseInteger3 {

    /*
    * Given a signed 32-bit integer x, return x with its digits reversed.
    * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
    * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    */
    public static void main(String[] args) {
        System.out.println(reverse(Integer.MAX_VALUE));

    }

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            // 1. Pop the last digit from x
            int pop = x % 10;
            x /= 10;

            // 2. Check for positive overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // 3. Check for negative overflow before multiplying by 10
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            // 4. Safe to update the reversed number
            reversed = reversed * 10 + pop;
        }

        return reversed;
    }

}
