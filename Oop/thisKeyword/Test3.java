package Oop.thisKeyword;
/**
 * in  the example below : this keyword can be used to invoke current class constructor

 */
public class Test3 {
    Test3()
    {
        this(10);
        System.out.println("no arguments");
    }
    Test3(int a )
    {

        System.out.println("Parametrised constructor");
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();

    }
}
