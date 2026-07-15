public class BinarySearch{

    public static int solve(int arr[], int s, int e, int target){
        if(s > e)return -1;

        int mid = s + (e - s)/ 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target){
            e = mid - 1;
        }else{
            s = mid + 1;
        }

       int ans =  solve(arr, s, e, target);
        return ans;
    }
    public static int binSr(int [] arr, int target){
        int s = 0, e = arr.length - 1;
        int ans = solve(arr, s, e, target);
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60,70};
        int target = 70;

        int ans = binSr(arr, target);
        System.out.println(ans);
    }
}