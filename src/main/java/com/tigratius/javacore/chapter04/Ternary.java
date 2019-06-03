package main.java.com.alex.javacore.chapter04;

public class Ternary {

    public static void main(String[] args) {

        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Абсолютное значение ");
        System.out.println(i + " = " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Абсолютное значение ");
        System.out.println(i + " = " + k);
    }
}
