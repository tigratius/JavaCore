package main.java.com.alex.javacore.chapter08.DemoBoxWeight;

public class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox = " + vol);
        System.out.println("Вес weightbox = " + weightbox.weight);
        System.out.println();

        // назначить ссылке на BoxWeight ссылку на Box
        plainbox = weightbox;

        vol = plainbox.volume(); // volume() определен в Box
        System.out.println("Объем plainbox = " + vol);

    /*Следующее утверждение недопустимо, т.к. переменная weight не определена в Box*/
//  System.out.println("Вес plainbox = " + plainbox.weight);
    }
}
