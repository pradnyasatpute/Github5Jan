package Oop.Polymorphism;
//
public class Animal {
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog obj = new Dog();
       // obj.sound();

    }
}
class Cat extends Dog{
    public void sound() {
        System.out.println("Cat sound");
    }

    public static void main(String[] args) {
                Cat obj2 = new Cat();
                obj2.sound();

    }

}
