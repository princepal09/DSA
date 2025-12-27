public class Kadens {

    public static void kadens(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);

        }

        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, -1, -2, 1, 5, 3};
        int n = arr.length;
        kadens(arr, n);

    }

}
