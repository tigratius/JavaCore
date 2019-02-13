package main.java.com.alex.javacore.chapter04;

public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;
        int i =  0x0f;
        int tb = b & 0x0f;
//        int ti = i >> 4;

        System.out.println(b);
        System.out.println(i);
        System.out.println(tb);
//        System.out.println(ti);
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f]
                                + hex[b & 0x0f]);
    }
}
