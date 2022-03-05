package Controlflowstatements;

/**
 * Syntax :
 * while(condition){
 *     //code
 * }
 */
public class WhileEg1 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5){
            System.out.println("i:"+i);
            i++;
        }
        while (true){
            System.out.println("Hello");
        }
    }
}
