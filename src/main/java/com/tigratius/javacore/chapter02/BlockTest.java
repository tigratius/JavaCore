package main.java.com.alex.javacore.chapter02;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x < 10; x++)
        {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            y -= 2;
        }
    }
}
