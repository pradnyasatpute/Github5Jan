package Controlflowstatements;

/**
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class NumberPatternEg5 {
    public static void main(String[] args) {
        int Count = 0;
        for (int i = 1;i<=4;i++){
            for (int j = 1;j<=i;j++){
                Count=Count+1;
                System.out.print(Count+" ");
            }System.out.println();
        }
    }
}
