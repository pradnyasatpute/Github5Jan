package Oop.inheritance;

public class Employee
{
    int Salary = 50000;

}
class Developer extends Employee{
    int bonus = 10000;

    void CalculateSalary()
    {
        int sal = Salary + bonus ;
        System.out.println("Total Salary is "+sal);
    }
}
class DeveloperImpl
{
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.CalculateSalary();
    }
}