
import java.util.*;

public class Ques {

    public static Set<Integer> intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        Set<Integer> result = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 7, 9};
        int[] arr2 = {3, 7, 9, 10, 1};
        Set<Integer> ans = intersection(arr1, arr2);
        for (int n : ans) {
            System.out.print(n + " ");

        }
    }
}
