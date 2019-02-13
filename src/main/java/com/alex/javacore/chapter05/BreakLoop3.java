package main.java.com.alex.javacore.chapter05;

public class BreakLoop3 {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 1 + i) break; // прерываем цикл, если j = 10 + i
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }
}
