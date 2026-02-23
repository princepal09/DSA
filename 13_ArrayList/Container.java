import java.util.*;

class Container {

    // TC => O(n^2)
    public static int maxArea(ArrayList<Integer> height) {
        int n = height.size();
        int maxWater = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int minHeight = Math.min(height.get(i), height.get(j));
                int area = width * minHeight;
                maxWater = Math.max(maxWater, area);
            }   
        }
 
        return maxWater;
    }

    // TC => O(n)
    public static int maxArea2(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height.get(left), height.get(right));
            int area = width * minHeight;

            maxWater = Math.max(maxWater, area);

            // Move the shorter pointer
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>(
                Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7)
        );

        System.out.println("Brute Force: " + maxArea(height));
        System.out.println("Two Pointer: " + maxArea2(height));
    }
}