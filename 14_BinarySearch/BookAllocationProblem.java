
public class BookAllocationProblem {

    public static boolean isValidAns(int arr[], int k, int mid) {
        int studentsCount = 1, pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            } else {
                studentsCount++;

                if (studentsCount > k || arr[i] > mid) {
                    return false;

                } else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }

    public static int findPages(int arr[], int k) {
        int s = 0, ans = -1, n = arr.length;

        if (n < k) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAns(arr, k, mid)) {
                ans = mid;
                e = mid - 1;

            } else {
                s = mid + 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        int ans = findPages(arr, k);
        System.out.println(ans);
    }
}
