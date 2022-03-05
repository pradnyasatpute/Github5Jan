package Oop;

public class Student5 {
    int id;
    String name ;
}
class TestStudent5{
    public static void main(String[] args) {
        //creating objects
        Student5 s1 = new Student5();
        Student5 s2 = new Student5();
        //initializing the objects
        s1.id = 101;
        s1.name = "Pradnya";
        s2.id = 102;
        s2.name = "Priti";
        //printing the values
        System.out.println(s1.id + "  "+s1.name);
        System.out.println(s2.id +"  "+s2.name);
    }
}
