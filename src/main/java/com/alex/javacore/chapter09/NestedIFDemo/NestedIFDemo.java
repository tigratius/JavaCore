package main.java.com.alex.javacore.chapter09.NestedIFDemo;

class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIFDemo {
    public static void main(String args[]) {

        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}
