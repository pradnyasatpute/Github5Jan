package Oop;

public class Animal1
{
    void eat()
    {
        System.out.println("in Animal Class");
    }
}
class Tiger extends Animal1 {
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger();
        t1.eat();
        System.out.println("in Child class");
    }
}
class Lion extends Animal1{
    public static void main(String[] args)
    {
        Lion L1 = new Lion();
        L1.eat();
        System.out.println("in Lion class");

    }
}