//Date : 14th feb , 2022

public class Variables
{
    int a = 10;
    static int b = 40;
    void add()
    {
        int c , d =100;
        c= a+b;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        int c = 30;
        Variables variables = new Variables();
        System.out.println(variables.a);
        System.out.println(variables.b);
        variables.a = 1000;
        System.out.println(variables.a);
        variables.b = 2000;
        System.out.println(variables.b);
        Variables obj2 = new Variables();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(c);
        obj2.add();
       // System.out.println(d); local variables does not have scope outside the method/ block /constructors
       //local varibles declare inside the  method/ block /constructors  not outside these three (store in stack memory)
    }

}
