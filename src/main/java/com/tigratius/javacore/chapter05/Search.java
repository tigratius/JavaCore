package main.java.com.alex.javacore.chapter05;

public class Search {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 1;
        boolean found = false;

        for (int x : nums) {
            System.out.println("x = " + x);
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Значение найдено!");
        else
            System.out.println("Значение не найдено!");
    }
}
