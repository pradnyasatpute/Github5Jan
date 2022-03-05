package Accessmodifiers;

public class Employee {
    int id;
    String name ;
    void display(){
        System.out.println("display");
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.display();
    }
}