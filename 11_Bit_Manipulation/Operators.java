
public class Operators {

    public static void binaryAnd() {
        int a = 5, b = 6;
        System.out.println(a & b);
    }

    public static void binaryOr() {
        int a = 5, b = 6;
        System.out.println(a | b);
    }

    public static void binaryXor() {
        int a = 5, b = 6;
        System.out.println(a ^ b);
    }

    public static void binaryOnesComplement() {
        int a = 0;
        System.out.println(~a);
    }
    public static void binaryLeftShift() {
        int a = 5;
        System.out.println(a<<2);
    }
    public static void binaryrightShift() {
        int a = 5;
        System.out.println(a>>2);
    }

    public static void main(String[] args) {
        binaryAnd();
        binaryOr();
        binaryXor();
        binaryOnesComplement();
        binaryLeftShift();
    }
}
