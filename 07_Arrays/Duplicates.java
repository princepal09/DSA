public class Duplicates{
    
    public static int removeDup(int arr[]){
        int n = arr.length;
        int x = 0;
        for(int i = 1; i < n ; i++){
           if(arr[i] != arr[x]){
            x += 1;
            arr[x] = arr[i];
           }
        }
        return x + 1;
    }
    public static void main(String args[]){
        int [] arr = {5,5,7,8,8,9,9,9,10,10};
        int ans = removeDup(arr);
        System.out.println(ans);
        for(int nums : arr){
            System.out.print(nums);
        }
    }
}