public class FuncOverloading{
    // Multiple functions with same name but different parameter

    public static int multiply(int a, int b){
        return a * b;
    }
    public static float multiply(float a, float b){
        return a * b;
    }
  
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }
        public static void main(String[] args) {
         System.out.println(multiply(2,5));
         System.out.println(multiply(2,5,9));
         System.out.println(multiply(2.3f,4.2f));
    }
}