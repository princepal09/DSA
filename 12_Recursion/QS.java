public class QS{

    public static int nthStairs(int n ){
        if(n < 0){
            return 0;
        } 
        if(n == 1){
            return 1;
        }
        return nthStairs(n - 1) + nthStairs(n - 2);

    }
    public static void main(String[] args) {
        System.out.println(nthStairs(3));
    }
}