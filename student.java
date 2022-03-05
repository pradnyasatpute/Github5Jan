import javax.swing.text.Style;

public class student {
    public static void main(String args[]) {
        int m1 = 75;
        int m2 = 85;
        String city = "Pune";
        String address = "kothrud 411028";
        //simple if
        if (m1 < 80) {
            System.out.println("Distinction");
        }
        // if else
        if (m1 > 80) {
            System.out.println("Distinction");
        } else {
            System.out.println("First Class");
        }
        // if-else-if-ladder
        if (city == "mumbai") {
            System.out.println("Student is from mumbai");
        } else if (city == "Nasik") {
            System.out.println("Student is from Nasik");
        } else if (city == "Pune") {
            System.out.println("Student is from pune");
        } else {
            System.out.println(city);
        }
        //nested if
        if (city == "Pune") {
            if (address == "kothrud 411028") {
                System.out.println("Welcome to kothrud");
            } else {
                System.out.println("Welcome to Warje");
            }
        }else{
                System.out.println("You are not from Pune");
            }
        }
    }

/**
 * * HomeWork
 * check whether the given number is even or odd
 * use % operator
 * int x =10 ---even
 * int x =11 ---odd
 */












