import java.util.*;

public class SumTwoNum {

   public static int sumOfNum(int n){
      int sum = 0;
      while(n > 0){
         int rem = n % 10;
         sum += rem;
         n /= 10;
      }
      return sum;
   }
   public static void main(String[] args) {

      // static class can call without a creating an object 
      // but if your class is not static then you have to create an object of class and then call the fn by the class object


      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the first number:");
      //  int a = sc.nextInt();
      //  System.out.println("Enter the second number:");
      //  int b = sc.nextInt();
      //  int sum = a + b;
      // System.out.println("The sum of " + a + " and " + b + " is " + sum);

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int sum = sumOfNum(n);
      System.out.println(sum);


      sc.close();



   }
}
