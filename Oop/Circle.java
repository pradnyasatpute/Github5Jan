package Oop;

public class Circle {
    double Radius ;
    void insertData( double r){
        Radius = r ;
    }
    void show(){
        System.out.println("The Radius of Circle is : "+Radius);
    }
    void CalculateArea(){
        double Area = 3.142* Radius * Radius ;
        System.out.println("The area of circle is : "+Area);
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.insertData(7.5);
        c1.show();
        c1.CalculateArea();
    }
}