package finalDemo;

/**
 * Final Keyword :
 *              -1.variable -
 *              -2.class
 *              -3.method - final method can not be override by the child class
 *              hacker Rank , litcode,
 */

public class FinalDemo {
    final int i = 8;
    final int j;
    final String Direction = "East";
    public void show(){
        System.out.println(i);
        System.out.println(Direction);
    }
     public FinalDemo(){
        j=199;
        System.out.println(j);
    }
    public void display(){
        System.out.println(j);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        obj.display();
//        FinalDemo obj1=new FinalDemo();
    }
}
 class FinalDemo2 extends FinalDemo{

}