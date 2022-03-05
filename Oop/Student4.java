package Oop;
//Initialization through reference
public class Student4 {
    int id;
    String name;
}
class TestStudent4{
    public static void main(String[] args) {
        Student4 s4 = new Student4();
        s4.id = 101;
        s4.name = "Pradnya";
        System.out.println(s4.id +"  "+ s4.name);
    }
}