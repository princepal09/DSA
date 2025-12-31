
public class SearchInSortedArray {

    public static boolean byBinarySearch(int arr[][], int key) {

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = (start + (end - start)) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == key) {
                System.out.println("Key found at: " + row + "," + col);
                return true;
            } else if (arr[row][col] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Sorry key is not found");
        return false;

    }

    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 110, 120},
            {130, 140, 150, 160}};

        byBinarySearch(arr, 80);
    }
}
