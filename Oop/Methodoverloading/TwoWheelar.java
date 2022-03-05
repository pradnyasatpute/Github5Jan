package Oop.Methodoverloading;

public class TwoWheelar {
   int speed = 100;
   void display(){
       System.out.println("speed is : "+speed);
   }
}
class pulsar extends TwoWheelar{
    int speed = 120;
    void display(){
        System.out.println("speed is :"+speed);
    }
}
class Honda extends TwoWheelar{
    int speed = 80;
    void display(){
        System.out.println("speed is :"+speed);
    }
}


class BikeImpl {
    public static void main(String[] args) {
        TwoWheelar bike = new pulsar();
        bike.display();
        TwoWheelar bike1 = new Honda();
        bike1.display();
    }
}