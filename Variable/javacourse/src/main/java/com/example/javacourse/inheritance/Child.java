package com.example.javacourse.inheritance;

public class Child extends Parent {

    // overrding
    public void sellCar() {
        super.sellCar();
        System.out.println("I will give 5% extra discount");
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.businessName);
        c.sellCar();
    }
}
