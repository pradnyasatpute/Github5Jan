//Date : 14th feb , 2022
package Controlflowstatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("select symbol(+,-,*,/)");
        String symbol = sc.next();
        int result;
        switch (symbol)
        {
                case "+":
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Invalid symbol");
            }
            System.out.println("Do you want to continue Y/N");
            yn = sc.next();
           }while (yn.equals("Y") );
    }
}
