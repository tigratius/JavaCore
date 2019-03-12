package main.java.com.alex.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[]) {

        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        System.out.print("Начально состояние: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("После fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("После сортировки снова: ");
        display(array);

        System.out.print("Значение -9 находится по индексу ");
        int index =
                Arrays.binarySearch(array, -9);

        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i : array)
            System.out.print(i + " ");

        System.out.println();
    }
}
