package Oop;

import com.sun.tools.javac.Main;
//java program to demonstrate having main method in the another class
//creating Student3 class
public class Student3 {
    int RN = 42;
    String Name = "Pradnya";
}
//creating another class which contains main method
class TestStudent3{
    public static void main(String[] args) {
        Student3 s3 = new Student3();
        System.out.println("RN : "+s3.RN);
        System.out.println("Name : "+s3.Name);
    }
}

