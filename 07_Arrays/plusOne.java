public class plusOne {

    public static int[] plusone(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;  
            } else {
                digits[i] = 0;
            }
        }

        // If all digits were 9
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {9, 9, 9, 9};
        int[] ans = plusone(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}