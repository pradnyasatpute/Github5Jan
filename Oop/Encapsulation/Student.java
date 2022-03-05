package Oop.Encapsulation;

public class Student {
    private int id;
    private String name;
    private String password ;
    private int age = 20;
    //Setter : to set values
    //Getter : to get Values
    public  void setId(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setName(String nm){
        name=nm;
    }
    public String getName(){
        return name ;
    }
    public void setpassword(String pswd){
        password = pswd;
    }
    public int getAge(){
        return age;
    }


}
class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.getid();
        System.out.println(s1.getid());
        s1.setName("Pradnya");
        s1.getName();
        System.out.println(s1.getName());
        s1.setpassword("");
        s1.getAge();
        System.out.println(s1.getAge());

    }
}
