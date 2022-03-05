package Oop.Polymorphism;

public class Shape {
   // double insertData(double a , double b){
   //     return 2;

    void calculatearea(){

    }

}
class Square extends Shape{
    double side = 10;
    void calculatearea(){
        double area = side * side ;
        System.out.println(" The area of Square is : "+area);
    }
}
class  Rectangle extends Shape {
    double length = 10;
    double width = 10;


    void calculatearea() {
        double area = length * width;
        System.out.println(" The length of Rectangle is : " + area);

    }
}
class Circle extends Shape{
    double radius = 5;
    void calculatearea(){
        double area = 3.14 *radius*radius ;
        System.out.println(" Area of circle is :"+area);
    }
}
class Triangle extends Shape{
    double base = 13;
    double height = 10;
    void calculatearea(){
        double area = base * height/2 ;
        System.out.println(" The area of Triangle is : "+area);
    }
}
class shapeImpl {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculatearea();
        shape = new Rectangle();
        shape.calculatearea();
        shape = new Square();
        shape.calculatearea();
        shape = new Triangle();
        shape.calculatearea();
    }
}


