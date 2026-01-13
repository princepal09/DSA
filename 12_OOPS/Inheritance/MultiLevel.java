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
 class C extends B{
    void printout(){
        System.out.println("Child2 Class");
    }
}

public class MultiLevel{
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        obj.printout();
    }
}