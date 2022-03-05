package Oop.Abstraction;

public abstract class Animal {
    abstract void sounds ();
}
class Cat extends Animal{
    void sounds(){
        System.out.println("Cat sounds Meow");
    }
}
class Lion extends Animal{
    void sounds(){
        System.out.println("Lion sounds Roar");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sounds();

        Lion lion = new Lion();
        lion.sounds();
    }
}
