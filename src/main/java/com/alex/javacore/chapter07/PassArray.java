package main.java.com.alex.javacore.chapter07;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Кол-во аргументов: " + v.length +
                " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};

        vaTest(n1); // 1 аргумент
        vaTest(n2); // 3 аргумента
        vaTest(n3); // пусто
    }
}
