
class SearchElement {

    public static boolean searchingElem(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Key found at " + "(" + i + ","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("OOPS key not found ");
        return false;
    }

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int key = 8;

        searchingElem(arr, key);
    }
}
