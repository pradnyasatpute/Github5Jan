package Oop.Methodoverloading;

public class Vehicle {
    void show(){
        System.out.println("in vehicle class");
    }
}
class Car extends Vehicle{
    void show() {
        System.out.println("in car class");
    }
}
class Bike extends Vehicle{
    void show(){
        System.out.println("in Bike class");
    }
}

class CarImpl{
    public static void main(String[] args) {
        Car car=new Car();
        car.show();
    }
}