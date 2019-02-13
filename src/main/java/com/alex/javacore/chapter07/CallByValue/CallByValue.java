package main.java.com.alex.javacore.chapter07.CallByValue;

class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {

    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b до вызова метода: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a и b после вызова метода:  " +
                a + " " + b);
    }
}
