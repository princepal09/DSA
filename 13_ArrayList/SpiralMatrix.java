import java.util.ArrayList;

public class SpiralMatrix{

    public static ArrayList<Integer> spiralMatrix(int matrix[][]){
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        
        int left = 0, right = matrix[0].length - 1;
        int top = 0 , bottom = matrix.length - 1;

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top ++;

            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right --;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom --; 
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left ++; 
            }

            
        }
        return result;

    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
            };

       ArrayList<Integer> res =  spiralMatrix(matrix);
    //    System.out.print(res);
       for(int i = 0 ; i < res.size(); i++){
        System.out.print(res.get(i) + " ");
       }
    }
}