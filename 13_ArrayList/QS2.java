import java.util.ArrayList;
import java.util.Collections;

public class QS2{

    public static int maximum(ArrayList<Integer> list){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
                maxi = Math.max(maxi,list.get(i));
        }
        return maxi;
    }
      

     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
     } 
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(0);
       int ans =  maximum(list);
       System.out.println(ans);

    //    swap(list,2,3);
    
    Collections.sort(list);

    }
}