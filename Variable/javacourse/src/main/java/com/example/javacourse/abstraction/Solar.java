package com.example.javacourse.abstraction;

public class Solar implements PowerSource {

    public void plugin() {
        System.out.println("Plugin from Solar Source");
    }

    public void solarFunction() {
        System.out.println("This is solar specific function");
    }
}
