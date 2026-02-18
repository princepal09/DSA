
public class PrefixSum {

    public static void suffixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i];
        }
    }

    public static int[] prefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = arr[i] + pref[i - 1];

        }
        return pref;

    }

    public static void prefixSumArray2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5};
        //    int[] pref =  prefixSumArray(arr);
        prefixSumArray2(arr);
        // printArray(arr);
        // System.out.println("Suffix Sum Array :  ");
        // suffixSumArray(arr);
        printArray(arr);

    }
}
