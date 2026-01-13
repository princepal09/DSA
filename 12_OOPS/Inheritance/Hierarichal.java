 class A{
    void show(){
        System.out.println("Parent Class");
    }
}

 class B extends A{
    void display(){
        System.out.println("Child Class");
    }
}
 class C extends A{
    void printout(){
        System.out.println("Child2 Class");
    }
}

public class Hierarichal{
    public static void main(String[] args) {
        C obj = new C();
        B obj2 = new B();
        obj.show();
        obj.printout();
        obj2.display();
        obj2.show();
    }
}