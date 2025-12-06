public class MAXMIN{

    public static int findMax(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int findMin(int arr[]){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,5,8,11,76};
       int largest = findMax(arr);
        int minimum = findMin(arr);
       System.out.println(largest);
       System.out.println(minimum);
    }
}