package Oop.inheritance;

public class Vehicle {
    int gear ;
    int wheels;
}
class car extends Vehicle
{
    String color ;
    String name ;
    void insertData(int g , int w , String c , String nm)
    {
        gear= g;
        wheels= w;
        color= c;
        name = nm;
    }
    void display() {
        System.out.println("The vehicle car has following properties : ");
        System.out.println("gear   : "+gear );
        System.out.println("wheels : "+wheels);
        System.out.println("color  : "+color);
        System.out.println("name   : "+name);
    }

    public static void main(String[] args) {
        car ob1 = new car();
        ob1.insertData(5,4,"Red","Breeza");
        ob1.display();
    }
}