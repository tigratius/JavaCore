package main.java.com.alex.javacore.chapter03;

public class ScopeErr {

    public static void main(String[] args) {
        int bar = 1;
        {
//            int bar =2; // bar is already defined in the scope
        }
    }
}
