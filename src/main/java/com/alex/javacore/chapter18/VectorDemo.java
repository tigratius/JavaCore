package main.java.com.alex.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {

        Vector<Integer> v = new Vector<Integer>(3, 2);

        System.out.println("Начальный размер: " + v.size());
        System.out.println("Начальная вместимость: " +
                v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Вместимость после добавления 4-х элементов: " +
                v.capacity());
        v.addElement(5);
        System.out.println("Текущая вместимость: " +
                v.capacity());
        v.addElement(6);
        v.addElement(7);

        System.out.println("Текущая вместимость: " +
                v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Текущая вместимость: " +
                v.capacity());
        v.addElement(11);
        v.addElement(12);


        System.out.println("Первый элемент: " + v.firstElement());
        System.out.println("Последний элемент: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Vector содержит 3.");

        Enumeration<Integer> vEnum = v.elements();

        System.out.println("\nЭлементы в vector:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
