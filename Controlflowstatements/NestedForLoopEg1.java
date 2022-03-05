package Controlflowstatements;

/**
 * Syntax :
 * for(initialization;condition;incr/decr){
 *     for(initialization;condition;incr/decr){
 *         //code
 *     }
 * }
 */
public class NestedForLoopEg1 {
    public static void main(String[] args){
        for (int i = 1; i<4; i++){
            for (int j = 1; j<4; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
