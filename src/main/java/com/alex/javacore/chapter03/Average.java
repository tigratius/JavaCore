package main.java.com.alex.javacore.chapter03;

public class Average {

    public static void main(String[] args) {

        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            result += nums[i];
        }

        System.out.println("average value = " + result/length);
    }
}
