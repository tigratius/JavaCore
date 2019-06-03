package main.java.com.alex.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);

        if (b)
            System.out.println("Printed out...");

        b = false;
        if (b)
            System.out.println("Not printed out...");

        System.out.println("1O > 9 равно " + (10 > 9));
    }
}
