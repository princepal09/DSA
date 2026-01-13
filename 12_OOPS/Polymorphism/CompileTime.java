// Achieved my method overloading
// also called Static polymorphism
 class A{
    int mul(int a, int b){
        return a*b;
    }
    int mul(int a, int b, int c){
        return a*b*c;
    }
    double mul(double a, double b){
        return a*b;
    }
}

public class CompileTime{
   public static void main(String[] args) {
       A obj = new A();
       obj.mul(4,8);
       obj.mul(4,8,9);
       obj.mul(4.98,7.0);
   }
}