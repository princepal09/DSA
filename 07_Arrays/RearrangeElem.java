
public class RearrangeElem {

    public static  int[] rearrangeArray(int[] nums) {
        int n = nums.length, pe = 0, ne = 1;
        int[] ans = new int[n];

        for (int elem : nums) {
            if (elem > 0) {
                ans[pe] = elem;
                pe += 2;
            } else {
                ans[ne] = elem;
                ne += 2;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = rearrangeArray(arr);
        for(int elem : ans){
            System.out.println(elem);
        }
    }
}
