package main.java.com.alex.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Исходное содержимое al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> liter = al.listIterator();
        while (liter.hasNext()) {
            String element = liter.next();
            liter.set(element + "+");
        }

        System.out.print("Измененное содержимое al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Измененный в обратном порядке список: ");
        while (liter.hasPrevious()) {
            String element = liter.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
