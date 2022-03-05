import java.util.Scanner;

public abstract class Homework1 {
    abstract void CalculateArea();

}
class circle extends Homework1{
    double Radius = 40;

    void CalculateArea(){
        double area =  3.14*Radius*Radius ;
        System.out.println("The area of circle is : "+area);
    }
}
class Square extends Homework1{
    double side = 40;
    void CalculateArea() {
        double area = side * side;
        System.out.println("The area of square is : "+area);
    }
}
class Rectangle extends Homework1{
    double length = 10;
    double Width = 10;
    void CalculateArea(){
        double area = length* Width;
        System.out.println("The area of Rectangle : "+area);
    }
}
class Triangle extends Homework1{
    double base = 10;
    double height = 10;
    void CalculateArea(){
        double area = base * height /2;
        System.out.println("The area of Triangle is : "+area);
    }
}
class Homework1Impl {
    public static void main(String[] args) {
        int ch;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Circle");
            System.out.println("2.Square");
            System.out.println("3.Rectangle");
            System.out.println("4.Triangle");
            System.out.println("Exit");
            System.out.println("Enter your Choice");
            ch = scanner.nextInt();
            Homework1 shape;
            switch (ch) {
                case 1:
                    shape = new circle();
                    shape.CalculateArea();
                    break;
                case 2:
                    shape = new Square();
                    shape.CalculateArea();
                    break;
                case 3:
                    shape = new Rectangle();
                    shape.CalculateArea();
                    break;
                case 4:
                    shape = new Triangle();
                    shape.CalculateArea();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while (ch >6);
    }
}
