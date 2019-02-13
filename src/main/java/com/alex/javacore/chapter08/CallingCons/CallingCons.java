package main.java.com.alex.javacore.chapter08.CallingCons;

class A {
    A() {
        System.out.println("В кострукторе A.");
    }
}

class B extends A {
    B() {
        System.out.println("В кострукторе B.");
    }
}

class C extends B {
    C() {
        System.out.println("В кострукторе C.");
    }
}

public class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
