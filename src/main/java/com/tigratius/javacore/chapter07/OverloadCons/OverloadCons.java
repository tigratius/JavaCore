package main.java.com.alex.javacore.chapter07.OverloadCons;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {

    public static void main(String args[]) {

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 = " + vol);

        vol = mycube.volume();
        System.out.println("Объем mycube = " + vol);
    }
}
