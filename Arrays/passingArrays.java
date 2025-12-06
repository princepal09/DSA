public class passingArrays{


    public static void update(int arr[]) {
        for (int i = 0; i < arr.length ; i++){
            arr[i] = arr[i] + 1;
 
        }
        
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
 
        }
        
    }

    public static void main(String args[]){
        int arr[] = {2,5,7,4,9};
        update(arr);
        printArray(arr);
    }
}