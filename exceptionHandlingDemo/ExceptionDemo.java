package exceptionHandlingDemo;

/**
 * Question : can you write nested try or nested catch or try under catch
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        try {
            int k = i / j;   //Critical Statement
            System.out.println(k);
            System.out.println("hello");
            System.out.println("Hello");
        } catch (ArithmeticException e) {
            System.out.println(e);

        }
        System.out.println("Hello Pradnya"); //Normal Statement
        System.out.println("Hello Pradnya");
    }
}
