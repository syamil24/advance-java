package com.assignment;

public class DataType {
    public static void main(String[] args) {
        byte by1 = 127;
        byte by2 = (byte) 300; // downcasting

        System.out.println("By2 Value us " + by2);
        // -121 will be shown because it will circulate within the byte range (-128,
        // 127)
    }
}
