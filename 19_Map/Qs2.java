
import java.util.HashMap;

public class Qs2 {

    public static int[] highLowFreq(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int minKey = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int key : freq.keySet()) {
            if (freq.get(key) > maxValue) {
                maxValue = freq.get(key);
                maxKey = key;
            }
            if (freq.get(key) < minValue) {
                minValue = freq.get(key);
                minKey = key;
            }
        }

        int result[] = {maxKey, minKey};
        return result;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 3, 1, 4, 1, 4, 1, 4, 1};
        int result[] = highLowFreq(arr);
        System.out.println("Max frequency element" + result[0]);
        System.out.println("Min frequency element" + result[1]);
    }
}
