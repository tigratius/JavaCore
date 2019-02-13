package main.java.com.alex.javacore.chapter05;

public class BreakLoop {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // прерываем цикл при i = 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
