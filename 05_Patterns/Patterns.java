
public class Patterns {

    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void charPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int n, int cols) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == n || j == 1 || j == cols) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public static void inverPyra(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void inverPyraNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                  System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void floydTrian(int n){
        int count = 1;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTria(int n){
        for(int i = 1; i <= n; i++){
            for(int j =1; j <=i; j++){
                if((i + j)% 2 == 0) {
                    System.out.print("1"+" ");
                } else{

                    System.out.print("0"+" ");
                }
            }
                System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        // For first Half
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }

        // For Second Half
        for(int i = n; i >= 1; i--){
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i;j++){

                System.out.print(" ");
                
            }
            for(int j = 1; j<=n;j++){

                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n){
        // first HAlf 
        for(int i = 1; i <= n; i++){
            for(int j =1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Sescond HAlf 
        for(int i = n; i >=1; i--){
            for(int j =1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // starPattern(5);
        // invertedStarPattern(4);
        // halfPyramid(4);
        // charPattern(4);
        // hollowRectangle(4,5);
        // inverPyra(4);
        // inverPyraNum(5);
        //  floydTrian(5);
        // zeroOneTria(5);
        // butterflyPattern(5);
        // solidRhombus(5);
        diamondPattern(5);
    }

}
