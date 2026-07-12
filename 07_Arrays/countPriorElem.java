
import java.util.Scanner;

public class countPriorElem {

    public static int priorCount(int arr[]) {
        int count = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i : arr) {
            i = sc.nextInt();
        }

        int ans = priorCount(arr);
        System.out.println(ans);

    }
}
