package main.java.com.alex.javacore.chapter08.UseSuper;

class A {
    int i;
}

class B extends A {
    int i; // этот член i скрывает член i из класса А

    B(int a, int b) {
        super.i = a; // i в A
        i = b; // i в B
    }

    void show() {
        System.out.println("i в superclass: " + super.i);
        System.out.println("i в subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
