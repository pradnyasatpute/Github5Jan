package Oop.Methodoverloading;

public class Employee {
        double salary = 50000;
    }
class Developer extends Employee {
    double salary = 30000;

    double CalculateSalary() {
        double totalSalary = 5000 + salary;
        System.out.println("The totalsalary is : "+totalSalary);
        return totalSalary;
    }

        void printSalary() {
            System.out.println("The Salary is : " + salary);

        }
}
class Tester extends Employee{
    double CalculateSalary(){
        double TotalSalary = 1000 + salary;
        System.out.println("The totalsalary is : "+TotalSalary);
        return TotalSalary ;
    }
    void printsalary(){
        System.out.println("The salary is : "+salary);
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Developer obj1 = new Developer();
        obj1.printSalary();
        obj1.CalculateSalary();
        Tester obj2 = new Tester();
        obj2.printsalary();
        obj2.CalculateSalary();
    }
}


