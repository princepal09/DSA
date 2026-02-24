
public class RotateArray {

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
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 8, 9, 10};
        int k = 4;
        rotate(arr, k);
        for(int nums : arr){
            System.out.print(nums + " ") ;
        }
    }
}
