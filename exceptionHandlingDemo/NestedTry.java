package exceptionHandlingDemo;

/**
 * if we don't remember which exception is that then you can go in hierarchy manner from  last exception to Exception
 */
public class NestedTry {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = i / 0;
            System.out.println("in first try block");
            try
            {
                System.out.println("in second try block");
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e)
            {
                System.out.println(e);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}

