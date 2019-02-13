package main.java.com.alex.javacore.chapter09.interfaces;

public interface MyIF {
    int getNumber();

    // объявление метода по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
