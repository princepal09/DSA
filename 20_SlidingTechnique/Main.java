public class Main{

    public static int maxSum(int arr[], int k){
        int currSum = 0;
        int n = arr.length;
        for(int i = 0; i < k; i++){
              currSum += arr[i];
        }

        int maxSum = currSum;
           
        for(int i = 1; i <= n-k; i ++){
            currSum = currSum - arr[i - 1] + arr[i + k - 1];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {100,200,50,0,300,20,100};
        int ans = maxSum(arr, 3);
        System.out.println(ans);
    }
}