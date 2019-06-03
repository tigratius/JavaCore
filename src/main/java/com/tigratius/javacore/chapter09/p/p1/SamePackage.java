package main.java.com.alex.javacore.chapter09.p.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("samepackage конструктор");
        System.out.println("n = " + p.n);

        //  недоступно
        //  System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
