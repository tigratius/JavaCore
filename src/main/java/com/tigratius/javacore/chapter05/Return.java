package main.java.com.alex.javacore.chapter05;

public class Return {

    public static void main(String args[]) {
        boolean t = true;

        System.out.println("Дo возврата.");

        if (t) return; // возврат в вызывающий код

        System.out.println("Этот оператор выполняться не будет.");
    }
}
