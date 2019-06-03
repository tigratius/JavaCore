package main.java.com.alex.javacore.chapter05;

public class SampleSwitch {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i = " + i);
                    break;
                case 1:
                    System.out.println("i = " + i);
                    break;
                case 2:
                    System.out.println("i = " + i);
                    break;
                case 3:
                    System.out.println("i = " + i);
                    break;
                default:
                    System.out.println("i > 3");
            }
    }
}
