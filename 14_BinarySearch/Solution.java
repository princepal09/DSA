public class Solution {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } 
            else if (target > arr[mid]) {
                left = mid + 1;   // search right half
            } 
            else {
                right = mid - 1;  // search left half
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10};
        System.out.println(binarySearch(arr, 9));  // true
    }
}