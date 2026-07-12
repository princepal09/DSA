
import java.util.ArrayList;
import java.util.Collections;

public class Leaders{

    public static ArrayList<Integer> lead(int [] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int rMax = Integer.MIN_VALUE;

        for(int i = arr.length - 1; i >=0 ; i --){
            if(arr[i] >= rMax){
                ans.add(arr[i]);
                rMax = arr[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,5,4,3,5,2};

        ArrayList<Integer> ans = lead(arr);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}