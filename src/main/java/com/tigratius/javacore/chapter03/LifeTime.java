package main.java.com.alex.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 5; x++)
        {
            int y = -1;
            System.out.println("y = " + y);

            y = 100;
            System.out.println("now y = " + y);
        }
    }
}
