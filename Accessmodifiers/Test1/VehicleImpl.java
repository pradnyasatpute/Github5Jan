package Accessmodifiers.Test1;

import Accessmodifiers.test.Vehicle;

public class VehicleImpl extends Vehicle  {
    public static void main(String[] args) {
        VehicleImpl v1 = new VehicleImpl();
        Vehicle v = new Vehicle();
        v.vehicleName();
        v1.company();

    }
}
