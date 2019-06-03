package main.java.com.alex.javacore.chapter09.interfaces;

public interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        throw new UnsupportedOperationException("не реализован метод clear()");
    }
}
