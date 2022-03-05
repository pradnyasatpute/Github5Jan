package constructor;

public class ConstructorEx1 {
    String name = "Karan";
    public ConstructorEx1(int i){
        System.out.println("hello");

    }
    public ConstructorEx1(String str){
        System.out.println(this.name);
        System.out.println("Pradnya");
    }

    public static void main(String[] args) {
        ConstructorEx1 obj = new ConstructorEx1('a');
        ConstructorEx1 obj2 = new ConstructorEx1("Pradnya");

    }
}
