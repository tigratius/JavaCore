package main.java.com.alex.javacore.chapter04;

public class ByteShift {
    public static void main(String[] args) {

        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение  a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
