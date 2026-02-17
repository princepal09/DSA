
import java.util.ArrayList;

public class QS2{

    public static int maximum(ArrayList<Integer> list){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
                maxi = Math.max(maxi,list.get(i));
        }
        return maxi;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       int ans =  maximum(list);
       System.out.println(ans);
    }
}