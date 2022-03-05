package Oop;

public class Square {
    int side;
    void insertData(int s){
        side = s;
    }
    void show(){
        System.out.println("side of the square is : "+side);
    }
    void CalculateArea() {
        int area = side * side ;
        System.out.println("Area of Square is : "+area);
    }
}
class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.insertData(10);
        s1.show();
        s1.CalculateArea();

    }
}