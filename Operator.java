import com.sun.jdi.request.InvalidRequestStateException;
/**
**1.Unary operators: expr++,expr--,++expr,__expr
2.Arithmetic operator: +,_,/,%
**3.Left Shift Operator:<<
**4.Right Shift Operator:>>
**5.Logical Operator: Logical AND(&&) , Logical OR(||)
**6.Bitwise Operator:Bitwise AND,Bitwise OR
7.Ternary Operator: ? , :
8.Relational Operator :
9.Assignment Operator: =,+=,-=,*=,/=
 */

public class Operator {
    public static void main(String[] args){
        //unary operator
        int n=20;
        System.out.println(n); //20
        System.out.println(n++); //20
        System.out.println(n); //21 assign increment
        System.out.println(++n); //22 increment assign
        System.out.println(n--); //22assign decrement
        System.out.println(n);//21
        System.out.println(--n); //20 decrement assign
        System.out.println(n++ + ++n); //20+22=42

        int a=25;
        int b=-25;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//(-a)-1= -25-1=-26
        System.out.println(~45);//-45-1=-46
        System.out.println(~a + ~b); // -26+24=-2
        System.out.println(!c);//false

        // Left Shift Operator
        a=20;
        b=40;
        System.out.println(a<<2); //20*2^2=80
        System.out.println(b<<3);//40*2^3=320
        System.out.println(15<<4);//15*2^4=240
        System.out.println(8<<3);//8*2^3=64
        System.out.println(25<<2);//25*2^2=100


        //Right Shift Operator
        System.out.println(a>>2);//20/2^2=20/4=5
        System.out.println(b>>3);//40/2^3=40/8=5
        System.out.println(a>>8);

        //Logical Operator
        a=20;
        b=5;
        int x =25;

        System.out.println(a<b && a<x); // false = false
        // if the first condition is false then logical operator && does not check the 2nd condition
        System.out.println(a>b || a>x);//true|=true

        //Bitwise Operator
        System.out.println(a<b && a<x); // false & true = false
        // it always  checks both the conditions whether 1st condition is false
        System.out.println(a>b | a>x); // true | false = true

        System.out.println(15*5/2+3-4+25*6/3);
        //Ternary Operator - replacement of if else (important)
        a=7;
        b=9;
        int min = a<b ? a : b;
        System.out.println(min);
       /* if(a<b)
            min=a;
        else
            min=b;.[]

        */
        //Relational Operators
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);

        //Assignment Operator
        a+=50;//a=a+50
        System.out.println(a);
        b-=30;//b=b-30
        System.out.println(b);

        /**
         * take 2 numbers by using ternary operator find min & max
         *
         */
        int e = 16;
        int g = 19;
        int min1 = e<g ? e : g;
        System.out.println(min1);

        int max = g>e ? g : e;
        System.out.println(max);

    }
}
