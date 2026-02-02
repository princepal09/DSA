
public class Arrays {

    public static void printElem(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.print(arr[idx]);
        printElem(arr, idx + 1);
    }

    public static int maxElem(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int smallAns = maxElem(arr, idx + 1);
        return Math.max(smallAns, arr[idx]);

    }

    public static int sumOfArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int smallSum = sumOfArr(arr, idx + 1);
        return arr[idx] + smallSum;
    }

    public static boolean isSorted(int[] arr, int n, int idx) {
        if (idx == n - 1) {
            return true;
        }

        if (arr[idx] > arr[idx + 1]) {
            return false;
        }

        return isSorted(arr, n, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9};
        // printElem(arr, 0);
        // System.out.println(maxElem(arr, 0));
        // System.out.println(sumOfArr(arr, 0));

        System.out.println(
                isSorted(arr, arr.length, 0)
                ? "Array is Sorted"
                : "Oops!!! Array is not Sorted!!"
        );

    }
}
