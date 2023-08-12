package com.example.javacourse;

public class StaticExample {
    private static int i;
    private int j;

    public static void display() {
        System.out.println(i);
        // System.out.println(j); // j need object in order to access it
        // Since this function is static, it does not need an object to access it, so j
        // cannot be put here
    }

    public static void main(String[] args) {
        i = 100;
        StaticExample staticExample = new StaticExample();
        staticExample.display();
    }
}
