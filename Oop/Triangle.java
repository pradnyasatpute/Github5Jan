package Oop;

public class Triangle {
    int base;
    int height;
    void insertData(int b , int h) {
        base = b;
        height = h;
    }
    void show(){
        System.out.println("Base : "+base+" Height: "+height);
    }
    void calculateArea(){
        System.out.println("Area = "+ base*height*0.5);
    }
}
class Triangleimpl{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.insertData(10,5);
        t1.show();
        t1.calculateArea();
    }
}
