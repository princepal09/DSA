
import java.util.HashMap;

public class TwoSum {

    public static int[] twosum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 4, 2, 1};
        int target = 10;
        int res[] = twosum(arr, target);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}
