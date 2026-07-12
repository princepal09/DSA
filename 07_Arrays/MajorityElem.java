
import java.util.Arrays;

public class MajorityElem {

    public static int bruteF(int[] arr) {
        int n = arr.length;
        int freq = 0;
        for (int val : arr) {
            for (int el : arr) {
                if (el == val) {
                    freq++;
                }
            }

            if (freq > n / 2) {
                return val;
            }
        }
        return -1;

    }

    public static int optimizeApp(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int freq = 1;
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {

                freq = 1;
                ans = arr[i];
            }
            // Check the last element's frequency
            if (freq > n / 2) {
                return ans;
            }
        }

        return ans; // No majority element
    }

    public static int mooresVotingAlgo(int[] arr) {
        int freq = 0, ans = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                ans = arr[i];
            }
            if (ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }

        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 1, 1};
        System.out.println(bruteF(arr));
        System.out.println(optimizeApp(arr));
        System.out.println(mooresVotingAlgo(arr));

    }
}
