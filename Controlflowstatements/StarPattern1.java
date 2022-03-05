package Controlflowstatements;

public class StarPattern1 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
/**
 * In the above program i started from 1 to 4 i.e ..increasing
 * aslo j is increasing from 1 to 4
 * but you have to write j<=i that means j is depends on i ...due to that we got the pattern in the triangle format
 */