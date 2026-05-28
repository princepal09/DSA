
class SearchInRotatedSortedArray {

    public static int pivotIndex(int arr[]) {
        int n = arr.length;
        int s = 0, e = n - 1, ans = -1;

        if (arr[s] < arr[e]) {
            return - 1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    public static int binarySearch(int arr[], int s, int e, int key) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return - 1;
    }

    public static int search(int[] arr, int key) {

        int n = arr.length;
        int pivot = pivotIndex(arr);

        if (pivot == -1) {
            int ans = binarySearch(arr, 0, n - 1, key);
            return ans;
        }

        int startingArray1 = 0, endingArray1 = pivot;
        int startingArray2 = pivot + 1, endingArray2 = n - 1;

        if (key >= arr[startingArray1] && key <= arr[endingArray1]) {
            int ans = binarySearch(arr, startingArray1, endingArray1, key);
            return ans;
        } else {
            int ans = binarySearch(arr, startingArray2, endingArray2, key);
            return ans;
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        int ans = search(arr, key);
        System.out.println(ans);
    }
}
