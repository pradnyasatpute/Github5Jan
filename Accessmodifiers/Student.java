package Accessmodifiers;

public class Student {
    private int id;
    private String name ;
    private String address;
    void show(){
        System.out.println("show method");
    }
}
class StudentImpl{
    public static void main(String[] args) {
//        private members not accessible outside the class
//        Student student = new Student();
//        student.show();
    }
}
