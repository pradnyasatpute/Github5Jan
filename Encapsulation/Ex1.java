package Encapsulation;

public class Ex1 {
    private int id ;
    private String Name;
    public void setId(int i ){
        id=i;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
class Ex1Impl{
    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        obj.setId(101);
        obj.getId();
        System.out.println(obj.getId());
        obj.setName("Pradnya");
        System.out.println(obj.getName());
        System.out.println(obj.getId()+" "+obj.getName());
    }
}
