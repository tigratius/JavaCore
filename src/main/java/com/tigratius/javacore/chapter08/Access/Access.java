package main.java.com.alex.javacore.chapter08.Access;

/*Это программа не сколмпилируется*/

class A {
    int i; // public по умолчанию
    private int j; // private

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int total;

    void sum() {
//         total = i + j; // ERROR,к j нету доступа отсюда
    }
}

public class Access {
    public static void main(String args[]) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма = " + subOb.total);
    }
}
