package com.example.javacourse.polymorphism;

public class LaserPrinter extends Printer {

    @Override
    public void print(String document) {
        System.out.println("Printing using laser document");
    }

    /*
     * public void read() {
     * System.out.println("reading document");
     * }
     */

    public static void main(String[] args) {
        // Object will be created during run time, not compile time
        LaserPrinter lp = new LaserPrinter();

        // Parent can hold child object, but not the opposite
        Printer p = new LaserPrinter(); // upcasting
        p.print("Test doc");
        lp.print("passport");
        lp.print("test");
        /*
         * Runtime Polymorphisms
         * p.read(); //Error occurred during compile time due to Printer does not have
         * any read method
         */

        Printer p1 = new LaserPrinter(); // upcasting
        p1.print("Offer Letter");

        LaserPrinter p2 = (LaserPrinter) p1; // downcasting
        p2.print("Offer Letter");
        p2.read();
        p1.read();
    }

}
