package AbstractDemo;

public  class AbsImpl extends AbsEx1{
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        AbsImpl obj =  new AbsImpl();
        obj.sound();
    }
}
