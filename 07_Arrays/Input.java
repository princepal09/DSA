
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // case 1. given n elements
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        // case 2 -> size not known 
        // logic -> aray starting string
        String input = sc.nextLine();
        String a[] = input.split(",");
        ArrayList<Integer> ar = new ArrayList<>();

        for (String token : a) {
            int num = Integer.parseInt(token);
            ar.add(num);
        }

        for(int i : ar){
            System.out.println(i);
        }

    }

}
