
public class MissingNum {

    public static int MissingNum(int[] arr) {
        int xorSum = 0;
        for (int num : arr) {
            xorSum = xorSum ^ num;
        }

        for (int i = 0; i <= arr.length; i++) {
            xorSum = xorSum ^ i;
        }

        return xorSum;

    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 0, 3, 4};
        int ans = MissingNum(arr);
        System.out.println(ans);
    }
}
