package main.java.com.alex.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String args[]) {
        Properties capitals = new Properties();

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();

        for (Object name : states)
            System.out.println("Столица " +
                    name + " это " +
                    capitals.getProperty((String) name)
                    + ".");

        System.out.println();

        String str = capitals.getProperty("Florida", "Не найдено");
        System.out.println("Столица Florida это "
                + str + ".");
    }
}
