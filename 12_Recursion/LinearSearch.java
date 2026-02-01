public class LinearSearch{


      // check if the element is found in array or not
    public static boolean searchElem(int arr[], int n, int target, int idx){
        if(idx == n) return false;
        if(arr[idx] == target) return true;

        return searchElem(arr,n, target, idx+1);
    }

    // return index of element 
    public static int searchElemIndx(int arr[], int n, int target, int idx){
        if(idx == n) return -1;
        if(arr[idx] == target) return idx;

        return searchElemIndx(arr, n, target, idx + 1);

    }

    public static void findAllIndices(int ar[], int n, int key, int idx){
         if(idx >=n) return ;

         if(ar[idx] == key){
            System.out.println(idx);
         }
         findAllIndices(ar,n, key, idx+1);
    }
    public static void main(String args[]){
        int arr[] = {4,12,5,14,3,8,6,1};
        int ar [] = {1,2,3,2,2,5};
        int target = 14;
        int key = 2;
        if(searchElem(arr,arr.length,target,0)){
            System.out.println("Found!!");
        }else{
            System.out.println("Not Found");
        }

        System.out.println(searchElemIndx(arr, arr.length, target, 0));
        
        findAllIndices(ar, ar.length,key, 0);

    }
}