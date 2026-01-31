
public class LargestElement {

// Largest Element
    public static int LargestElement(int arr[]) {
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxi = Math.max(arr[i], maxi);
        }
        return maxi;
    }
 
// Second Largest Element  
    public static int secondLargestElem(int arr[]) {
        int maxi = arr[0], secondMaxi = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxi) {
                secondMaxi = maxi;
                maxi = arr[i];
            } else if (arr[i] < maxi && arr[i] > maxi) {
                secondMaxi = arr[i];
            }

        }
        if (secondMaxi == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMaxi;
    }

    public static void main(String args[]) {
        int arr[] = {25, 16, 38, 10, 35, 48, 20, 50};
        System.out.println(secondLargestElem(arr));
    }
}
