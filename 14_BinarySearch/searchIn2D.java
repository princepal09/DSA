
class searchIn2D {

    public static  boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int s = 0, e = (m * n) - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 23;
        if (searchMatrix(mat, target)) {
            System.out.println("Yes, Your element is present in the matrix");
        } else {
            System.out.println("OOP!! element is not present in the matrix");

        }
    }
}
