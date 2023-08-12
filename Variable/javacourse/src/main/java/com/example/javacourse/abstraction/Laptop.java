package com.example.javacourse.abstraction;

public class Laptop {

    public static void main(String[] args) {
        Printer laserPrinter = new LaserPrinter();
        Printer normalPrinter = new NormalPrinter();

        laserPrinter.print("HEllO");
        normalPrinter.print("HELLO");
    }
}
