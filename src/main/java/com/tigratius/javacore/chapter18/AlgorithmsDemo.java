package main.java.com.alex.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String args[]) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        System.out.print("Начальное состояние: ");
        for (int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(linkedList, r);

        System.out.print("Сортировка в обратном порядке: ");
        for (int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        Collections.shuffle(linkedList);

        System.out.print("После перемешивания: ");
        for (int i : linkedList)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Min: " + Collections.min(linkedList));
        System.out.println("Max: " + Collections.max(linkedList));
    }
}
