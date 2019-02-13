package main.java.com.alex.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {

        int x, y;

        x = 5;
        y = 10;

        if (x < y)
            System.out.println("x < y");

        x *= 2;
        if (x == y)
            System.out.println("x = y");

        x *= 2;
        if (x > y)
            System.out.println("x > y");

        if (x == y)
            System.out.println("there is nothing here");
    }
}
