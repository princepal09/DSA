
public class Counting {

    public static void printingNum(int n) {
        // Base Condition
        if (n == 0) {
            return;
        }

        printingNum(n - 1); // Recursive Relation
        System.out.println(n); // Processing

    }
    public static void printingreverseNum(int n) {
        // Base Condition
        if (n == 0) {
            return;
        }

        System.out.println(n); // Processing
        printingreverseNum(n - 1); // Recursive Relation

    }

    public static void main(String[] args) {
        int n = 5;
        printingNum(n);
        printingreverseNum(n);
     
    }

}
