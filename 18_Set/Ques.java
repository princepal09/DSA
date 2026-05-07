
import java.util.*;

public class Ques {

    public static Set<Integer> union(int[] arr1, int[] arr2) {
        HashSet<Integer> st = new HashSet<>();

        for (int num : arr1) {
            st.add(num);
        }

        for(int num : arr2){
            st.add(num);
        }

        return st;

    }

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
        // Set<Integer> ans = intersection(arr1, arr2);
        Set<Integer> ans = union(arr1, arr2);
        for (int n : ans) {
            System.out.print(n + " ");

        }
    }
}
