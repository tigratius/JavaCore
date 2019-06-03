package main.java.com.alex.javacore.chapter06.BoxDemo7;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {

    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 = " + vol);
    }
}
