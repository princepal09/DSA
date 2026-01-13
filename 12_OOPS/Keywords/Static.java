
class Test{
    static int a = 10;

    void m1(){

        // static int b = 20 ; // it will throw error
    }
}

class Employee {
    int empid;
    String name;
    static String company = "SP";

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;

    }

    void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    
}

public class Static{
    public static void main(String[] args) {
        Employee e1= new Employee(202,"Prince");
        Employee e2 = new Employee(201,"Monika");
        e1.display();
        e2.display();
    }
}