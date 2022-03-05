package Oop.inheritance;

public class Animal { // parent class or super class
    void eat(){
        System.out.println("in parent class");

    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("in child class");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.walk();
    }
}