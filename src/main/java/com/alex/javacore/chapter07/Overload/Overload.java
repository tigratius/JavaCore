package main.java.com.alex.javacore.chapter07.Overload;

class OverloadDemo {
    void test() {
        System.out.println("Без параметров");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class Overload {

    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("ob.test(123.25) = " + result);
    }
}
