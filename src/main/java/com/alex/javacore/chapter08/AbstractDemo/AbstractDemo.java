package main.java.com.alex.javacore.chapter08.AbstractDemo;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}

class B extends A {
    @Override
    void callme() {
        System.out.println("Peaлизaция метода callme() из класса В.");
    }
}

public class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
