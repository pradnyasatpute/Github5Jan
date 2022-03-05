package Controlflowstatements;

public class Starpattern {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();

            for (int k = 3; k >= 1; k--)
            {
                System.out.println("*");
            }
        }
    }
}
