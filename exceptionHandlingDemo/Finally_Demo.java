package exceptionHandlingDemo;

/**
 * finally block is executed in both condition 1.exception is handled 2.exception is not handled means
  if your try block gets terminated directly then also finally block executed &
  if try block is successfully completed then also finally  block gets executed
 */

public class Finally_Demo {
    public static void main(String[] args) {
        try {
//            System.exit(-1);
            int i = 10;
            int j = i / 1;
            System.out.println("in first try block");
            try {
                System.out.println("in second try block");
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }  finally {
//            int i = 1/0;
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }
    }
}