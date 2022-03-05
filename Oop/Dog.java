package Oop;

//java program to illustrate how to define class and field
//defining a student class
class Student1 {
    //defining fields
    int id = 01; //field or data or instance variable
    String name = "Pradnya";

    //creating main method inside the student1 class
    public static void main(String[] args) {
        //creating an object or instance
        Student1 s1 = new Student1(); //Creating an object of Student1
        //Printing values of the object
        System.out.println(s1.id); //accesing member through reference variable
        System.out.println(s1.name);
    }
}
