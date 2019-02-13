package main.java.com.alex.javacore.chapter05;

public class StringSwitch {

    public static void main(String args[]) {

        String str = "три";
//        String str = "четыре";

        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("Нет совпадения");
                break;
        }
    }
}
