package com.example.javacourse;

public class Counter {

    static int count = 0;

    public Counter() {
        super();
        count++;
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println("Total object created is " + Counter.count);

    }
}
