package main.java.com.alex.javacore.chapter07.Overload2;

class OverloadDemo {
    void test() {
        System.out.println("Без параметров");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double) а: " + a);
    }
}

public class Overload {

    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}
