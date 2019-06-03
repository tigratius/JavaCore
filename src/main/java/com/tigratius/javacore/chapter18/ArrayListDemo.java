package main.java.com.alex.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер al: " +
                al.size());

        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Размер после добавления элементов: " +
                al.size());

        System.out.println("Содержимое al: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("Размер после удаления: " +
                al.size());
        System.out.println("Содержимое al: " + al);
    }
}
