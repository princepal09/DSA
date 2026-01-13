class A{
    int a = 10;
    void m1(){
        System.out.println("Class A");
    }
}
class B extends A{
    int a = 20;
    void show(int a ){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
         super.m1();
    }
   
}


public class Super{
    public static void main(String[] args) {
        B obj = new B();
        obj.show(80);
    }
}