package Oop;

public class Employee {
    int id;
    String name ;
    void insertData(int i , String nm){
        id = i;
        name = nm;
    }
    void show(){
        System.out.println(id+" "+name);
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.insertData(101,"abc"); // passing arguments
        e1.show();
        Employee e2 = new Employee();
        e2.insertData(102,"pqr");
        e2.show();
    }
}
