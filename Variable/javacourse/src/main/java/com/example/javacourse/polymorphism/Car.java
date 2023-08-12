package com.example.javacourse.polymorphism;

public class Car extends Vehicle {

    // @Override
    protected void drive() {
        System.out.println("Car is driving from function car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }

    /*
     * Access Specifiers
     * -Private, Default, Protected, Public
     * Child must have larger visibility
     */
}
