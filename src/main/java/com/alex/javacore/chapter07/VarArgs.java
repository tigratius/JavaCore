package main.java.com.alex.javacore.chapter07;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Кол-во аргументов: " + v.length +
                " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        vaTest(10);      // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(1, 2, 3, 4, 5, 6, 7); // 7 аргумента
        vaTest();        // пусто
    }
}
