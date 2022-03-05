package exceptionHandlingDemo;

/**
 * Throw :
        it throws exception only
 *Throws :
 *      it declares the exception
 *
 *     /* if we put all the code from if loop in the try block and
 *     then catch block ...at that time we handled that exception
 *     and we move forward towards the further code for execution
 *     and at that time we get output as hello also with exception
 *       ( difference between both given below )
 */
public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        int age = 15;

        if (age < 15) {
            System.out.println("you can vote");
        } else {
            throw new Exception("You can't vote");
        }

        System.out.println("Hello");
    }
}

/**
 * difference between throw and throws
 *
 *                 Throw                                      .        Throws
 *     1. it is used to throw exception                1. it is used to declare the exception
 *     2.it is used within method                      2.  it is used with method signature
 *     3.you can throw only one exception at a time    3. you can declare multiple exception at a time
 *     4.it is used with new instance                  4. it is used with class instance
 *
 */
