package com.example.javacourse;

import javax.print.DocFlavor.STRING;

public class Cars {
    int seats;
    String breaksystem;

    static String serviceCenter;

    public Cars() {
        super();
    }

    public void drive() {
        System.out.println("I am driving to " + seats + " seat car and using " + breaksystem);
        System.out.println("I am going to " + serviceCenter);
    }

    public static void main(String[] args) {
        Cars car1 = new Cars(); // it will store in heap

        Cars.serviceCenter = "Mumbai";
        car1.seats = 4;
        car1.breaksystem = "ABS";

        Cars car2 = new Cars();
        car2.seats = 7;
        car2.breaksystem = "Normal Break";

        car1.drive();
        car2.drive();
    }
}
