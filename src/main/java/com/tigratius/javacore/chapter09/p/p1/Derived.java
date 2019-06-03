package main.java.com.alex.javacore.chapter09.p.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("derived конструктор");
        System.out.println("n = " + n);

        //  недоступно поле n_pri
//          System.out.println("n_pri = " + n_pri);


        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
