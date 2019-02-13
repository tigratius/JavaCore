package main.java.com.alex.javacore.chapter06.BoxDemo6;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {

    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 =  " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 =  " + vol);
    }
}
