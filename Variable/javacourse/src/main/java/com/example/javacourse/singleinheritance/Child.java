package com.example.javacourse.singleinheritance;

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();

    }

}
