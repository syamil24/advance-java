package com.example.javacourse;

public class Blocks {
    static {
        System.out.println("executing static block");
    }

    public Blocks() {
        System.out.println("Blocks constructor created");
    }

    {
        System.out.println("Executing non-static block");
    }

    public static void main(String[] args) {
        // Classname.main({})

        // It will execute non static first before go through static
        Blocks b = new Blocks();
    }
}
