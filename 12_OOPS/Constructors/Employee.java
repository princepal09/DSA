public class Employee{
    String name;
    int empid;

    Employee(String name, int empid){
        this.name = name;
        this.empid = empid;
    }

    public void display(){
        System.out.println("Hey my Name is:"+name+" and employee id is:"+empid);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Prince",102);
        Employee e2 = new Employee("Monika",101);
        e1.display();
        e2.display();
       
    }

}