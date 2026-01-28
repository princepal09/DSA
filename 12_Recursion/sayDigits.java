
public class sayDigits {

    public static String sayDig(int n, String[] arr) {
       if (n == 0) return "";
    return sayDig(n / 10, arr) + arr[n % 10] + " ";
    }

    public static void main(String[] args) {
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(sayDig(412, arr));
    }
}
