public class moveZeroes {

   public static void moveZeroes(int[] nums) {
    int lastNonZero = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            int temp = nums[lastNonZero];
            nums[lastNonZero] = nums[i];
            nums[i] = temp;
            lastNonZero++;
        }
    }
}

    public static void main(String args[]) {
        int arr[] = {0, 0, 9, 9};
        moveZeroes(arr);
    }
}