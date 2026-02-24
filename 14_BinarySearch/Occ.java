
public class Occ {

    public static int firstOcc(int arr[], int x) {
        int n = arr.length;
        int fo = -1;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                fo = mid;
                end = mid - 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return fo;

    }

    public static void main(String args[]) {
        int arr[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9, 9};
        int x = 6;
        int firstOcc = firstOcc(arr, x);
        System.out.println(firstOcc);
    }
}
