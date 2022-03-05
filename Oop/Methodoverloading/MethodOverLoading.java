package Oop.Methodoverloading;

public class MethodOverLoading {
    int add (int a,int b){
        int result = a+b;
        return result;
    }
    int add (int a, int b , int c){
        return a+b+c;
    }
    float add(int a , float f){
        return a+f;
    }

    public static void main(String[] args) {
        MethodOverLoading demo = new MethodOverLoading();
        int r1 =demo.add(10,20);
        int r2=demo.add(10,20,30);
        float r3 =demo.add(10,40.0f);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(demo.add(10,11));


    }
}
