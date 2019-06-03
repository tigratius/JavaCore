package main.java.com.alex.javacore.chapter02;

public class ForTest {
    public static void main(String[] args) {

        int i;

        System.out.println("i++:");
        for (i = 0; i < 20; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("i--:");
        for (i = 20; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }
}
