package main.java.com.alex.javacore.chapter06.BoxDemo;

public class BoxDemo2 {
    public static void main(String args[]) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox1.width = 20;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 10;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем mybox1 = " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем mybox2 =  " + vol);
    }
}
