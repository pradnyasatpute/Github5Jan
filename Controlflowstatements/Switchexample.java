package Controlflowstatements;


/**
 * Syntax
 * switch(expr) {
 *     case value1 :
 *     //code
 *     break; //optional
 *     case value2;
 *     //code
 *     break;
 *     .
 *     .
 *     .
 *     .
 *     default : //optional
 *     //if all cases are not matched in that case default code is get executed
 * }
 */

public class Switchexample {
    public static void main(String[] args) {
        int n1 = 2;
        switch (n1){
            case 1:
                System.out.println("in case 1");
                break;
            case 2:
                System.out.println("in case 2");
                break;
            case 3:
                System.out.println("in case 3");
                break;
            default:
                System.out.println("no matching statement found");
        }
    }
}
