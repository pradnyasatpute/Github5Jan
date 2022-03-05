package Oop.inheritance;

import java.util.Scanner;

public abstract class Employee3 {
    int id ;
    String name;
    String mobile;
    String email;
    abstract void insertData(int i, String nm, String mob, String em);
    abstract void display();

}
class Develop extends Employee3 {
    String Designaation;

    void insertData(int i, String nm, String mob, String em) {
        id = i;
        name = nm;
        mobile = mob;
        email = em;
    }

    void display() {
        System.out.println("id :" + id + "       " + "name : " + name + "      " + "mobile: " + mobile + "        " + "em: " + email);
    }
}
class Tester extends Employee3{
    String Designaation;
    void insertData(int i, String nm, String mob, String em){
        id = i;
        name = nm;
        mobile = mob;
        email = em;
    }
    void display() {
        System.out.println("id :" + id + "       " + "name : " + name + "      " + "mobile: " + mobile + "        " + "em: " + email);
    }

}
class Employee3Impl{
    public static void main(String[] args) {
       /** Develop develop = new Develop();
        develop.insertData(101,"Pradnya","1234","abc@gmail.com");
        develop.display();
        Tester tester = new Tester();
        tester.insertData(102,"Karan","4567","pqr@gmail.com");
        tester.display();
        */

        int ch;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Developer");
            System.out.println("2.Tester");
            System.out.println("Exit");
            System.out.println("Enter your Choice");
            ch = scanner.nextInt();
            Employee3 employee3;
            switch (ch) {
                case 1:
                    employee3 = new Develop();
                    employee3.insertData(101,"Pradnya","1234","pradnya01@gmail.com");
                    employee3.display();
                    break;
                case 2:
                    employee3 = new Tester();
                    employee3.insertData(102 ,"Karan","5678","Karan90@gmail.com");
                    employee3.display();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while (ch >3);
    }
}



