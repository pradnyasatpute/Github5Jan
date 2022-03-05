package Oop.inheritance;

public class Shape {
    int base ;
    int height ;
}
class Rectangle extends Shape{
    void insertData(int b , int h)
    {
        base = b;
        height= h;
    }
    Double CalculateArea(){
        int Area = base * height;
        System.out.println("Area of Rectangle is : "+Area);
        return 0.0;
    }

    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle();
        ob1.insertData(10,10);
        ob1.CalculateArea();
    }
}