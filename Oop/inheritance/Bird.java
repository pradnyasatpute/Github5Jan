package Oop.inheritance;

public class Bird {
    void eat(){
        System.out.println("in Bird class");
    }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("in Sparrow class");
    }
}
class BabySparrow extends Sparrow{
    void weep(){
        System.out.println("in BabySparrow class");
    }
}
class BabySparrowimpl {
    public static void main(String[] args)
    {
        BabySparrow babysparrow = new BabySparrow();
        babysparrow.eat();
        babysparrow.fly();
        babysparrow.weep();
    }
}