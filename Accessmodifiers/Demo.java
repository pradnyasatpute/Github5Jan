package Accessmodifiers;

public class Demo {
    void display(){
        System.out.println("in Default");
    }
    protected void show(){
        System.out.println("in Protected");
    }
    public void print(){
        System.out.println("in Public");
    }

//    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.display();
//        demo.show();
//    }
}
class DemoImpl{
    private void Area(){
        System.out.println("in Private");
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
        demo.show();
        demo.print();

        DemoImpl demo1 = new DemoImpl();
        demo1.Area();

    }
}

