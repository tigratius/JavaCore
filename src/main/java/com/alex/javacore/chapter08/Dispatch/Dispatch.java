package main.java.com.alex.javacore.chapter08.Dispatch;

class A {
    void callme() {
        System.out.println("вызываем callme метод из A");
    }
}

class B extends A {
    // override callme()
    @Override
    void callme() {
        System.out.println("вызываем callme метод из B");
    }
}

class C extends A {
    // override callme()
    @Override
    void callme() {
        System.out.println("вызываем callme метод из C");
    }
}

public class Dispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r; // получить ссылку на объект типа А

        r = a; // переменная r ссылается на объект типа A
        r.callme(); // вызываем callme метод A

        r = b; // переменная r ссылается на объект типа B
        r.callme(); // вызываем callme метод B

        r = c; // переменная r ссылается на объект типа C
        r.callme(); // вызываем callme метод C
    }
}
