
public class TrappingRainWater {

    // TC => O(n), SC => O(n) Approach 
    public static int findTrappedWater(int height[]) {

        int n = height.length;

        // Calculate left-max boundary ----> array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // Calculate right-max boundary ----> array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }

        int trappedWater = 0;
        // loop

        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMax,rightMax);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterLevel - height ;
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    // TC => O(n), SC => O(1) Approach 
    public static int trappedWater(int height[]) {
        int l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (l < r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax < rightMax) {
                trappedWater += leftMax - height[l];
                l++;
            } else {
                trappedWater += rightMax - height[r];
                r--;

            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height));
        System.out.println(findTrappedWater(height));

    }

}
