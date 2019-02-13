package main.java.com.alex.javacore.chapter09;

import main.java.com.alex.javacore.chapter09.interfaces.MyIF;

class MyIFImp implements MyIF {
    @Override
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    @Override
    public int getNumber() {
        return 50;
    }

    @Override
    public String getString() {
        return "Это другая символьная строка.";
    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        MyIFImp2 obj1 = new MyIFImp2();
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());

    }
}
