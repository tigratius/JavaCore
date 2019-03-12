package main.java.com.alex.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String args[])
            throws IOException {
        Properties ht = new Properties();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
        }

        do {
            System.out.println("Введите новое имя" +
                    " ('q' для выхода): ");
            name = br.readLine();
            if (name.equals("q")) continue;

            System.out.println("Введите номер: ");
            number = br.readLine();

            ht.put(name, number);
            changed = true;
        } while (!name.equals("q"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");

            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        do {
            System.out.println("Введите имя для поиска" +
                    " ('q' для выхода): ");
            name = br.readLine();
            if (name.equals("q")) continue;

            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("q"));
    }
}
