
class Main {

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int arr[], int k) {
        int start = 0, end = arr.length - 1;
        reverse(arr, start, end); // Reverse the array 
        reverse(arr, 0, k - 1); //reverse first k elements which is 3
        reverse(arr, k, end); // reverse the remaining part of the array

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 1};
        int k = 3;
        rotate(arr, k);
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
