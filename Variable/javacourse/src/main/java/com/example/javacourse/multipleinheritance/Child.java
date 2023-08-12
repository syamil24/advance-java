package com.example.javacourse.multipleinheritance;

public class Child extends Parent {
    public void m3() {
        System.out.println("M3 method from Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
        c.m3();
    }
}
