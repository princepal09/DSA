class Employee{
    private int empid;

    public void setID(int empid){
        this.empid = empid;
    }
    public int getID(){
        return empid;
    }
}

public class Encaps{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(400);
        System.out.println(e.getID());
    }
}