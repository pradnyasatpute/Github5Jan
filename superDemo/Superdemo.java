package superDemo;

/**
 * Super Keyword:
 *              -It gives the value of the Parent Class
 *               -it refers Parent class constructor
 *               -it refers  Parent class method
 *               -it refers Parent class
 *               -it refers Parent class
 */

public class Superdemo {
    int i = 2;
    public void show(){
        int i = 4;
        System.out.println("In Parent show ");
    }
    public Superdemo(){
        System.out.println("Default Constructor");
    }
    public Superdemo(int i){
        System.out.println("Default Constructor");
    }

}
class SuperDemo1 extends Superdemo{

    public void show(){
        int i = 4;
        System.out.println("In show"+" "+super.i);
    }
    public void display(){
        super.show();
        int i = 10;
        System.out.println("In display"+" "+super.i);
    }
     public SuperDemo1(){
        super();
         System.out.println("In constructor");
     }
     public SuperDemo1(int i){
        super(4);
         System.out.println("In last Constructor");
     }
    public static void main(String[] args) {
        SuperDemo1 obj = new SuperDemo1();
        obj.show();
        obj.display();
        SuperDemo1 obj2 = new SuperDemo1(1);

    }

}