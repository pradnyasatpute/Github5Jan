package Oop.inheritance;

public class Employee1 {
    Double salary = 10000.0;

    void display() {
        System.out.println("The salary is : " + salary);
    }
}

class PermanentEmployee extends Employee1 {
    double hike = 1.5;

    double CalculateTotalSalary() {
        double Salary = salary + (salary * hike / 100);
        System.out.println(Salary);
        return Salary;
    }
}

class TemporaryEmployee extends Employee1 {
    double hike = 0.5;

    double CalculateTotalSalary() {
        double Salary = salary + (salary * hike / 100);
        System.out.println(Salary);
        return Salary;
    }
}

class EmployeeImpl {
    public static void main(String[] args) {
        PermanentEmployee ob1 = new PermanentEmployee();
        ob1.display();
        ob1.CalculateTotalSalary();
        System.out.println(ob1.CalculateTotalSalary());


        TemporaryEmployee ob2 = new TemporaryEmployee();
        ob2.display();
        ob2.CalculateTotalSalary();
        System.out.println(ob2.CalculateTotalSalary());

    }
}