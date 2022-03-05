package Oop.thisKeyword;

public class ThisDemo {
    private int id;
    private String name;
    private String address;
    public void setValues(int id , String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public ThisDemo(){

        System.out.println("In Default Constructor");
    }
    public ThisDemo(int i){
        this();
        System.out.println("In Parameterized constructor");
    }
    public ThisDemo(String name){
        this(1);
        System.out.println("In Third Constructor");
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        thisDemo.setValues(101,"pradnya","Pune");
        System.out.println(thisDemo.id +" "+thisDemo.name+" "+thisDemo.address);
        ThisDemo t1 = new ThisDemo();
        t1.setValues(102,"Karan","Pune");
        System.out.println(t1.id+" "+t1.name+" "+t1.address);

        ThisDemo obj = new ThisDemo();
        ThisDemo obj2 = new ThisDemo(1);
        ThisDemo obj3 = new ThisDemo("Hello");


    }
}
