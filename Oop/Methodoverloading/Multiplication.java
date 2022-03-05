package Oop.Methodoverloading;

public class Multiplication {
    int mult(int a , int b ){
        int result = a*b ;
        return result ;
    }
    float mult(int a , float f ){
        float result = a*f ;
        return result ;
    }
    double mult(double a , int b){
        double result = a*b ;
        return result;
    }

    public static void main(String[] args) {
        Multiplication ob1 = new Multiplication();
        System.out.println(ob1.mult(10,10));
        System.out.println(ob1.mult(10,10f));
        System.out.println(ob1.mult(11.5,11));
    }
}
