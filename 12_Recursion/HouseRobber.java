class HouseRobber {
    public static int ans (int nums[], int i){
        if(i >= nums.length){
            return 0;
        }

        //includes
        int includeAns = nums[i] + ans(nums, i + 2);

        //excludes
        int excludeAns = 0 + ans(nums, i + 1);

        int finalAns = Math.max(includeAns, excludeAns);
        return finalAns;
    }
    public static void main(String [] args) {
        int i = 0;
        int nums[] = {2,7,9,3,1};
        int ans = ans(nums, i);
        System.out.println(ans);
    }
}