package StaticDemo;

/**
 * Static Keyword :
 *                 - Static can be variable , method & class
 *                 -when we create Static variable ....memory location happens only once
 *                 -we can used static variable ...when we have to show common properties or the common values
 */
public class StaticDemo {
    int id;
    String name;
    static String company_name = "Infosys";
    public StaticDemo(int id ,String name){
        this.id = id;
        this.name=name;
        System.out.println("id is : "+id +"  name is : "+name+"  Company Name is :"+company_name);

    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo(1 , "Pradnya");
        System.out.println("id is : "+obj.id +"  name is : "+obj.name+"  Company Name is :"+company_name);
    }
}
