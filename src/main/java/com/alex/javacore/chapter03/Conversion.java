package main.java.com.alex.javacore.chapter03;

public class Conversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 700.142;

        System.out.println("Преобразование типа int в byte: ");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\nПреобразование типа double в int: ");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\nПреобразование типа double в byte: ");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);
    }
}
