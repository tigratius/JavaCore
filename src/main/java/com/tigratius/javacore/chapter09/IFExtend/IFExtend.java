package main.java.com.alex.javacore.chapter09.IFExtend;

interface A {
    void meth1();

    void meth2();
}

interface B extends A {
    void meth3();
}

class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("meth1()");
    }

    @Override
    public void meth2() {
        System.out.println("meth2()");
    }

    @Override
    public void meth3() {
        System.out.println("meth3()");
    }
}

public class IFExtend {
    public static void main(String arg[]) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
