package Oop.thisKeyword;

/**
 * this keyword can be used to return the current class instance from the method
 */
public class Test6 {
    Test6 m1(){
        //System.out.println("in m1 method");
        return this;
    }
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.m1();

    }
}
