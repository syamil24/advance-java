package com.example.javacourse.abstraction;

public class Desktop {

    public static void main(String[] args) {
        PowerSource p1 = new Electricity();
        p1.plugin();

        PowerSource p2 = new Solar();
        p2.plugin();
        // p2.solar() - will not call this method since it resides under powersource
        // only

        PowerSource p3 = new Wind();
        p3.plugin();

        Solar s = new Solar();
        s.solarFunction();

    }
}
