package Oop;

public class Rectangle {
    int Length;
    int Breadth;
    void insertData(int l , int b){
        Length = l ;
        Breadth = b ;
    }
    void show(){
        System.out.println("The Rectangle has Length : "+Length+" and Breadth : "+Breadth);
    }

    void CalculateArea() {
        int Area = Length * Breadth ;
        System.out.println("The area of Rectangle is :"+Area);
    }

}
class TestRectangle{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.insertData(10,8);
        r1.show();
        r1.CalculateArea();
    }
}