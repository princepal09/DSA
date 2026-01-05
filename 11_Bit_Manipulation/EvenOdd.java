public class EvenOdd{

    public static boolean isEvenOdd(int n) {
        int bitMask = 1;

        if((n & bitMask) == 0){
             return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isEvenOdd(2));
    }
}