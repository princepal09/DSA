public class Occurence{

    public static int lowerBound(int arr[], int target){
            int n = arr.length;
            int start = 0, end = n - 1;
            int ans = n;

            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] >= target){
                    ans = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return ans;

    }

    public static int uppearBound(int arr[], int target){
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = n;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] <= target){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int findOcc(int arr[], int target){
         int lB = lowerBound(arr, target);
         int uB = uppearBound(arr, target);
         int occ = uB - lB;
         return occ;
    }
    public static void main(String [] args){
            int arr[] = {10,20,20,20,20,30,40,50};
            int target = 20;
            int ans = findOcc(arr, target);
            System.out.println(ans);
    }
}