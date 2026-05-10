import java.util.*;

// Qs. Missing Elements from an array with duplicates.
public class MissingElements {

    public static List<Integer> missingElem(int arr[]) {

        List<Integer> ans = new ArrayList<>();

        // marking
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            int pos = val - 1;

            if (arr[pos] > 0) {
                arr[pos] = -arr[pos];
            }
        }

        // positive index means missing number
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 4, 5};

        List<Integer> elem = missingElem(arr);

        for (int i : elem) {
            System.out.println(i);
        }
    }
}