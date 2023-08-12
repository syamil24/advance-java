package com.example.javacourse;

public class StringExample1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hi");
        builder.append(" Hello");
        builder.append(" Ssup");
        System.out.println(builder);
        System.out.println(builder.toString());

        System.out.println("--------------------Buffer------------------");

        StringBuffer buffer = new StringBuffer("Hi");
        buffer.append(" Hello");
        buffer.append(" Ssup");
        System.out.println(buffer);
        System.out.println(buffer.toString());
    }
}
