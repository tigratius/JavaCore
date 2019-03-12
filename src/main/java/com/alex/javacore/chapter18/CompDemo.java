package main.java.com.alex.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {

        return bStr.compareTo(aStr);
    }
}

class CompDemo {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
