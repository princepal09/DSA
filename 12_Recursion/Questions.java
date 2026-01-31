public class Questions{

    public static int sumOfDigits(int n ){
        if( n>=0 && n <=9) return n;

        return sumOfDigits(n/10) + n % 10;
    }
    
    public static int countOfDigits(int n ){
        if(n >= 0 && n <= 9) return 1;

        return countOfDigits(n/10) + 1;
    }
    
    // public static int pow(int p, int q){
        // if(q == 0) return 1;
        // return pow(p,q-1) * p;
        // not a good Approach O(n)
    // }
   
    public static int pow(int p, int q){
        if(q == 0) return 1;
        int smallPow = pow(p,q/2);
        if(q % 2 == 0) return smallPow  * smallPow;
        else return smallPow * smallPow * p;
        // It's a good approach because it takes O(log n ) time .
    }

    public static int reverseNum(int n, int rev){
        if( n == 0) return rev;
        return reverseNum(n/10, rev * 10 + n % 10);

    }
   
    public static void main(String [] args){
        // System.out.println(sumOfDigits(3021));
        // System.out.println(countOfDigits(3743));
        System.out.println(pow(2,4));
        

    }
}