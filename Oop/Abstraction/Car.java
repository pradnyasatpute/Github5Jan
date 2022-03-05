package Oop.Abstraction;

public class Car extends Vehicle{
    int wheels = 4;
    void start(){
        System.out.println("Start with key");
    }
}
class Bike extends Vehicle{
    int wheels = 2;
    void start(){
        System.out.println("Start with button");
    }
}
class VehiclImpl{
    public static void main(String[] args) {
        Vehicle vehicle ; //Reference var
        vehicle = new Car();
        vehicle.start();

        vehicle= new Bike();
        vehicle.start();
        vehicle.show();
        vehicle.display();
        vehicle.stop();
    }
}
