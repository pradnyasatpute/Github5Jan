package Oop.inheritance;

public class Teacher {
    int  id ;
    String name ;
    String subject ;

}
class PhysicsTeacher extends Teacher{
    void insert(){
        id = 1;
        name = " Ms.Satpute";
        subject = "Physics";
    }
    void show(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("subject : "+subject);
    }
}
class ChemistryTeacher extends Teacher {
    void insert(){
        int id = 2;
        String name = "Shinde";
        String subject = "Chemistry";
    }
    void show(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("subject : "+subject);
    }
}
class TeacherImpl {
    public static void main(String[] args) {
        PhysicsTeacher ob1 = new PhysicsTeacher();
        ob1.insert();
        ob1.show();

        ChemistryTeacher ob2 = new ChemistryTeacher();
        ob2.insert();
        ob2.show();


    }

}