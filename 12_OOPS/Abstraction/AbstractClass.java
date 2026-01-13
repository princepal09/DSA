
abstract class  Vehicle{
    int noOfTyres;
    abstract void start();

}

class Car extends Vehicle{
    void start(){
       System.out.println("Starts With Key"); 
    }
}

class Scooter extends Vehicle{
    void start(){
        System.out.println("Starts with kick");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Vehicle cr = new Car();
        cr.start();
        Vehicle sc = new Scooter();
        sc.start();

    }
}