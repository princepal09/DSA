import java.util.*;

public class creatingArray{

    public static void main(String args[]){
        // dataType array_name[] = new dataType[size];
        int marks[]  = new int [5];
        Scanner sc = new Scanner(System.in);
        //  marks[0] = sc.nextInt();
        //  marks[1] = sc.nextInt();
        //  marks[2] = sc.nextInt();
        //  System.out.println(marks[0]);
        //  System.out.println(marks[1]);
        //  System.out.println(marks[2]);

         for(int i = 0; i < 5; i++){
            marks[i] = sc.nextInt();
         }
         for(int i = 0; i < 5; i++){
           System.out.println(marks[i]);
         }

        

    }


}