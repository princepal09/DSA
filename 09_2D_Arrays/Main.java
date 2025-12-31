
class Main {

    public static int countSeven(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 7) {
                    count++;

                }
            }
        }
        return count;
    }

    public static int secondRowSum(int nums[][]) {
        int sum = 0;
      if(nums.length<2){
        return 0;
      }
      
      for(int j = 0; j < nums[1].length; j++){
        sum +=  nums[1][j];
      }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{4, 7, 8}, {8, 8, 7}};

//       Print the number of 7’s that are 
// in the 2d array.
        System.out.println(countSeven(arr));

        // Print out the sum of the numbers in the second row of the “nums" array.
        int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.println(secondRowSum(nums));

    }
}
