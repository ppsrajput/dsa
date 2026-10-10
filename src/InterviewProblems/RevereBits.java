package InterviewProblems;

public class RevereBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(6));
    }
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;       // Shifts the result bits to the left
            result |= (n & 1);  // Reads the last bit directly from n
            n >>>= 1;           // Shifts n's bits to the right

            System.out.printf("Iteration %2d | result bits: %32s\n",
                    (i + 1),
                    String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0')
            );
        }
        return result; // Returns a normal int ready to use
    }
}
