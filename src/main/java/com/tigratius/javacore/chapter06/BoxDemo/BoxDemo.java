package main.java.com.alex.javacore.chapter06.BoxDemo;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {

    public static void main(String args[]) {

        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}
