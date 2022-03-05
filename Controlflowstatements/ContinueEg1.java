package Controlflowstatements;

/**
 * continue is used in loop control statement when we need to jump to the next iteration
 * continue skips the matching condition whereas break directly terminates the loop after the true condition
 */

public class ContinueEg1 {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            if (i==7){
                continue;
            }System.out.println(i);
        }

    }
}
