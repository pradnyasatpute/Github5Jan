package Accessmodifiers.test;

public class Vehicle {
    private int Wheels(){
        System.out.println("in private ");
        return 0;
    }
    public String vehicleName(){
        System.out.println("in public");
        return null;
    }
    protected String company(){
        System.out.println("in protected");
        return null;
    }
    String color(){
        System.out.println("in default");
        return null;
    }

}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleName();
        vehicle.company();
        vehicle.color();
    }
}