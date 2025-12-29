import java.util.Arrays;
import java.util.Collections;

class inBuilt {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Integer arr[] = {2, 5, 1, 6, 8, 3};

        // Descending Order
        Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, si, ei, Collections.reverseOrder());

        printArr(arr);
    }
}
