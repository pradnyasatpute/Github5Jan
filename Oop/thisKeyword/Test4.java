package Oop.thisKeyword;

/**
 * this keyword can be used to pass as an argument in the method call
 */
public class Test4 {
    void m1(Test4 t4)
    {
        System.out.println("I'm in m1 method");
    }
    void m2()
    {
        m1(this);
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.m2();
    }
}
