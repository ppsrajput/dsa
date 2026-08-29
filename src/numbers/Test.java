package numbers;

public class Test {
    public static void main(String[] args) {
//        int a=1000000;
//        int b=1000000;
//        long c=(long)a*b;
//        System.out.println(c);

        int a=1000000;
        int b=1000000;
        long c=(long)(a*b);
        System.out.println(c);

        String unicode = "U+0905";

        int value = Integer.parseInt(unicode.substring(2), 16);

        System.out.println(value);System.out.println(Character.toChars(0x1F600));

    }
}
