import java.util.ArrayList;
import java.util.Scanner;

public class QS3 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println(list);
        sc.close();
    }
}
