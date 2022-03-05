package Oop.Abstraction;

public abstract class Vehicle {
    int wheels;
    abstract void start();

    static void show(){
        System.out.println("in static method ");
    }
    final void display(){
        System.out.println("in final method");
    }
    void stop(){
        System.out.println("in stop method");
    }
}
