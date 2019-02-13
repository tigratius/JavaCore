package main.java.com.alex.javacore.chapter07;

/*Это программа не компилируется, демонстрация неоднозначности*/

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " +
                "кол-во аргументов: " + v.length +
                " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...): " +
                "кол-во аргументов: " + v.length +
                " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }


    public static void main(String args[]) {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

        //vaTest(); // Ошибка: Неоднозначность!
    }
}
