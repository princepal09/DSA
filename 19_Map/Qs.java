
import java.util.HashMap;

public class Qs {

    public static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int mode = -1;
        int maxFreq = -1;

        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                mode = key;
            }
        }
        return mode;

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 2, 2, 3, 3, 3, 3, 1, 9};
        int ans = getMode(arr);
        System.out.println(ans);
    }
}
