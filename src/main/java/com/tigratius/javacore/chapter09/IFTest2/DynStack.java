package main.java.com.alex.javacore.chapter09.IFTest2;

import main.java.com.alex.javacore.chapter09.interfaces.IntStack;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    public DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Расширяем стек.");
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        } else
            return stck[tos--];
    }
}
