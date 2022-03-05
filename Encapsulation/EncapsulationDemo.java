package Encapsulation;

/**Encapsulation :
 *              - making field private and giving access via getter and setter methods
 * advantages :
 *          -can make method write only as well as read only
 *          -can protect from unauthorized access
 *
 */

public class EncapsulationDemo {
    private int id;
    private String Name;

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
class EncapsulationImpl{
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(101);
        obj.getId();
        System.out.println(obj.getId());

    }
}
