package main.java.com.alex.javacore.chapter03;

/*
    Вычислить расстояние , проходимое светом,
    используя переменные типа lonq
 */
public class Light {
    public static void main(String[] args) {

        int lightspeed;
        long days;
        long seconds;
        long distance;

        //примерная скорость света в мили/сек
        lightspeed = 186000;

        //кол-во дней
        days = 1000;

        //переводим дни в секунды
        seconds = days * 24 * 60 * 60;

        //расстояние пройденное светом
        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль. ");
    }
}
