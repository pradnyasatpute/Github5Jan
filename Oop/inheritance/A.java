package Oop.inheritance;

public class A
{
    void showA()
    {
        System.out.println("in class A ");
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("in class B");
    }
}
class C extends B
{
    void showC()
    {
        System.out.println("in class C");
    }

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        a1.showA();
        System.out.println("------------------------");
        b1.showA();
        b1.showB();
        System.out.println("------------------------");
        c1.showA();
        c1.showB();
        c1.showC();

    }
}