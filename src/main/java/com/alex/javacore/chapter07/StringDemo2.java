package main.java.com.alex.javacore.chapter07;

public class StringDemo2 {
    public static void main(String args[]) {

        String strOb1 = "strOb1";
        String strOb2 = "strOb2";
        String strOb3 = strOb1;

        System.out.println("длина strOb1: " +
                strOb1.length());

        System.out.println("символ по индексу 3 в strOb1: " +
                strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
