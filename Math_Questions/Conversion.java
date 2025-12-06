public class Conversion{
    public static int binToDec(int n){
        int pow = 0; 
        int decimalNum = 0 ;
        while(n>0){
            int rem  = n % 10;
            decimalNum = decimalNum + (rem * (int)Math.pow(2,pow));
            pow ++;
            n /= 10;

        }
        return decimalNum ;


    }
    public static int decToBin(int n){
        int pow = 0; 
        int decimalNum = 0 ;
        while(n>0){
            int rem  = n % 2;
            decimalNum = decimalNum + (rem * (int)Math.pow(10,pow));
            pow ++;
            n /= 2;

        }
        return decimalNum ;


    }
    public static void main(String[] args) {
        System.out.println(binToDec(100));
        System.out.println(decToBin(4));
    }
}