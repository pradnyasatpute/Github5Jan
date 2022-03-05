package Oop.Encapsulation;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private double bonus;
    private String email;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary1) {
        salary = salary1;
    }

    public void calbonus() {
        bonus = salary + 1000;
    }

    public double getBonus() {
        return bonus;
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(101);
        e1.getId();
        e1.setName("Pradnya");
        e1.getName();
        e1.setSalary(10000);
        e1.calbonus();
        e1.getBonus();
        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e1.getBonus());

    }
}



