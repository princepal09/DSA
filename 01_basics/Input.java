
import java.util.*;

public class Input {

    public static void main(String args[]) {

        //whenever --> primitive datatype --> sc.nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputL:");

        float x = sc.nextFloat();
        System.out.println(x);

        sc.nextLine();
        String input = sc.nextLine();
        System.out.println(input);

        double y = sc.nextDouble();
        System.out.println(y);

        char c = sc.next().charAt(0);
        System.out.println(c);

        sc.close();

        double pi = Math.PI;
        System.out.println(pi);

        System.out.printf("%2f",pi); // 3.14
        
    }

}

// import java.util.*;
// import java.io.*;
// class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// input a string
//         String name = br.readLine();
//         System.out.println(name);
// input a number
//    int number = Integer.parseInt(br.readLine());
//    System.out.println(number);
// float 
// float f = Float.parseFloat(br.readLine());
// System.out.println(f);
// float 
// double d = Double.parseDouble(br.readLine());
// System.out.println(d);
// boolean
// boolean b = Boolean.parseBoolean(br.readLine());
// System.out.println(b);
//     }
// }
