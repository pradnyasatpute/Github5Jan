package Oop.thisKeyword;

/**
 * this keyword can be used to pass as an argument in the constructor call
 */
public class Test5 {
    Test5(Testt testt)
    {
        System.out.println("test class constructor");
    }
}
class Testt{
    void m1(){
        Test5 test5=new Test5(this);
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        t.m1();
    }
}