class Container {

    // TC => O(n^2)
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;
                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }

    //  TC => 0(n) 
      public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxWater = Math.max(maxWater, area);

            // Move the shorter pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    
}