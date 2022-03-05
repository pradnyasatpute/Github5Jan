package Oop.thisKeyword;

/**
 * this keyword is the reference variable that refers to the current object
 * in the example below : this keyword is used to invoke current class instance variable
 * Use :
 *      -it invokes current class methods
 *      -it invokes current class Constructor
 */
public class Test {
    int i;
    void setvalues(int i){
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
}
class TestImpl{
    public static void main(String[] args) {
        Test test = new Test();
        test.setvalues(10);
        test.show();
    }
}