public class GCD{

    public static int sumTilln(int n){
        if(n == 0) return 0;
        return sumTilln(n - 1) + n;
    }
    public static int seriesSum(int n){
        if(n == 0) return 0;

        if(n % 2 == 0) {  
        return seriesSum(n - 1) - n;
        }else{
            return seriesSum(n - 1) + n;
        }
    }

    // public static int gcd(int x, int y){ // BruteForce Approach 
    //   for(int i = x; i >= 1; i --){
    //     if(x % i == 0 && y % i == 0){
    //         return i ;
    //     }
    //   }
    //   return -1;
    // }

    // public static int gcd(int x, int y){ // Second Approach For find GCD
    //   while(x%y!= 0 ){
    //     int rem =  x% y;
    //     x = y;
    //     y = rem;
    //   }
    //   return y;
    // }

    public static int gcd(int x, int y){ // Best Approach For find GCD using Euclid's Algorithm 
      if(y == 0) return x;

      return gcd(y, x%y);
    }

    
    public static void main(String args[]){
        // System.out.println(sumTilln(5));
        // System.out.println(seriesSum(4));
        System.out.println(gcd(12, 16));
        // System.out.println(seriesSum(4));

       
    }
}