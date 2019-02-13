package main.java.com.alex.javacore.chapter05;

public class DoWhile {

    public static void main(String args[]) {
        int n = 10;

        /*do {
            System.out.println("тик " + n);
            n--;
        } while (n > 0);*/

        do {
            System.out.println("тик " + n);
        } while (--n > 0);
    }
}
