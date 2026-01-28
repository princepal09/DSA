
public class Main {

    public static void sumOfNaturalNum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumOfNaturalNum(i + 1, n, sum);

    }

    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return printFactorial(n - 1) * n;
    }

    public static void printfib(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1);

    }
      
       public static int reverse(int n, int rev){
        if(n == 0) return rev;
        return reverse(n/10, rev * 10 + n % 10);
        
        
        
    }

    public static int fib(int n ){
        if(n == 0 || n == 1) return n;
        return fib(n - 1) + fib( n - 2);


    }

    public static void main(String args[]) {
        // int sum = 0, i = 0, n = 5;
        // sumOfNaturalNum(i, n, sum);
        // int factorial = printFactorial(n);
        // System.out.println(factorial);
        // int a = 0, b = 1;
        // System.out.println(0);
        // System.out.println(1);
        // printfib(a, b, n);
        // int n = 3021, rev = 0;
        // System.out.println(reverse(n, rev));
        for(int i = 0; i <= 10; i++){
        System.out.println(fib(i));

        }

    }
}
