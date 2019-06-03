package main.java.com.alex.javacore.chapter05;

public class Break {
    public static void main(String args[]) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("Не будет выполняться");
                }
                System.out.println("Не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
