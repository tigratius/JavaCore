package main.java.com.alex.javacore.chapter08.Override1;

/*Здесь демонсрируется перегрузка методов, а не переопределение, т.к. разная сигнатура методов*/

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: "); // вызывается метод show() в B
        subOb.show(); // вызывается метод show() в A
    }
}
