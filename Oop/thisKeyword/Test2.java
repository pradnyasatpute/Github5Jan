package Oop.thisKeyword;

public class Test2 {
    void display(){
        System.out.println("Hello");
    }
    void show(){
        this.display();   // if you don't use the "this" keyword , compiler automatically adds this keyword while invoking the method
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.show();
    }
}
