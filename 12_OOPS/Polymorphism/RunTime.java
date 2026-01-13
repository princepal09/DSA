// Achieved my method Overriding
// also called Dynamic polymorphism

class A{
    void show(){
        System.out.println("Parent Class");
    }
   
}

class B extends  A{
    void show(){
        System.out.println("Child Class");
    }
}

public class RunTime{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        
    }
}