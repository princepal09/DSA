
public class Transpose {

    public static int[][] transposeMat(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = arr[i][j];
            }
        }

        return result;
    }

    // What if the input is always a sqaure matrix
    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void SQMat(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[][] = {{2, 4, 6, 2}, {1, 3, 6, 8}, {9, 4, 1, 5}};
        // System.out.println("Before Transpose the Matrix");
        // printArr(arr);
        // int res[][] = transposeMat(arr);
        // System.out.println("After Transpose the Matrix");

        // printArr(res);
        int sqaureMat[][] = {{2, 4, 1}, {-10, 5, -11}, {18, -7, 6}};

        SQMat(sqaureMat);
        printArr(sqaureMat);

    }
}
