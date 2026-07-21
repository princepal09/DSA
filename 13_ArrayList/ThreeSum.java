        class ThreeSum {
            public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 2; i++ ){
            int s = i + 1, e = n - 1;
            while(s < e){
                int sum = nums[i] + nums[s] + nums[e];
                if(sum == 0){
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[s]);
                    triplets.add(nums[e]);
                    hs.add(triplets);

                    s++;
                    e--;
                }else if(sum < 0){
                    s ++;
                }else{
                    e --;
                }
            }
        }

       result.addAll(hs);
       return result;

    }
}