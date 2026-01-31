
public class SmallestElement {

    public static int minElem(int arr[]) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mini = Math.min(arr[i], mini);
        }
        return mini;
    }

    public static int secondMinElem(int arr[]) {
        int mini = arr[0], secondMini = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                secondMini = mini;
                mini = arr[i];
            } else if (arr[i] > mini && arr[i] < secondMini) {
                secondMini = arr[i];
            }
        }
        if (secondMini == Integer.MAX_VALUE) {
            return -1;
        }
        return secondMini;
    }

    public static void main(String args[]) {
        int arr[] = {25, 16, 38, 10, 35, 48, 20, 50};
        System.out.println(secondMinElem(arr));
    }
}
