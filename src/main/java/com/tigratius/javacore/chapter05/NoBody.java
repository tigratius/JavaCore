package main.java.com.alex.javacore.chapter05;

public class NoBody {
    public static void main(String args[]) {
        int i, j;

        i = 100;
        j = 200;

        // рассчитываем среднее значение переменных i и j
        while (++i < --j) ; // нету тела

        System.out.println("Среднее значение равно " + i);
    }
}
