
class PaintersPartitionProblem {

    public boolean isValidSolution(int mid, int arr[], int k) {

        int paintersCount = 1;
        int painterLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (painterLength + arr[i] <= mid) {
                painterLength += arr[i];
            } else {
                paintersCount++;

                if (paintersCount > k || arr[i] > mid) {
                    return false;
                } else {
                    painterLength = 0;
                    painterLength += arr[i];
                }
            }
        }
        return true;
    }

    public int minTime(int[] arr, int k) {
        int n = arr.length, sum = 0, ans = -1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum, s = 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidSolution(mid, arr, k)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;

    }
}
