package Constructor;
//Parameterised constructor
public class Employee2 {
    Employee2(int a){
        System.out.println("Parameterised constructor");
    }

    public static void main(String[] args) {
        Employee2 e2 = new Employee2(10);
    }
}
