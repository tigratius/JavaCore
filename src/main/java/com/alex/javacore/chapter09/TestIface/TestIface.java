package main.java.com.alex.javacore.chapter09.TestIface;

import main.java.com.alex.javacore.chapter09.interfaces.Callback;

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
        ((Client) c).nonIfaceMeth();
    }
}
