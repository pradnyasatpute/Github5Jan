
public class SwitchExample2 {
    public static void main(String[] args) {
        char ch = 'T';
        switch (ch){
            case 'S' :
                System.out.println("Sunday");
                break;
            case 'M' :
                System.out.println("Monday");
                break;
            case 'T' :
                System.out.println("Tuesday");
                break;
            case 'W' :
                System.out.println("Wednesday");
                break;
            case 'H':
                System.out.println("Thursday");
                break;
            case 'F' :
                System.out.println("Friday");
                break;
            case 'U':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
