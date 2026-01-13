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

public class SingleLevel{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}