package main.java.com.alex.javacore.chapter09.IFTest2;

import main.java.com.alex.javacore.chapter09.interfaces.IntStack;

public class IFTest2 {
    public static void main(String args[]) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());

        System.out.println("mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
