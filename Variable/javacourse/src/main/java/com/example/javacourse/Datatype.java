/*
 */

package com.example.javacourse;

/**
 * Hello world!
 *
 */
public class Datatype {

    boolean b3;
    byte by3;
    char c;
    short s; // range from -32768 to 32767 (2^15)
    int i;
    float f;
    double d;
    long l;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Datatype app = new Datatype();
        System.out.println(app.b3);
        System.out.println(app.by3);
        System.out.println(app.c);
        System.out.println(app.s);
        System.out.println(app.i);
        System.out.println(app.l);
        System.out.println(app.f);
        System.out.println(app.d);

        short s3 = (short) 32768; // downcasting
        System.out.println(s3);

        short s4 = 128;
        byte by4 = (byte) s4;
        System.out.println(by4);

        // This will throw error because short is 2 bytes, but byte can only hold 1 byte
        // byte by5 = s4

        byte by5 = 10;
        short s5 = by5;

        float f = 13.2f; // need to put f at the end
        double d1 = 13.2f;
        double d2 = 13.2; // by default decimal values are double
        int i3 = (int) f; // it will remove the decimal point
        System.out.println(i3);

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'A';
        String st1 = "A";

        System.out.println("A".hashCode()); // conver char to ascii
        System.out.println("AC".hashCode());
        System.out.println(st1.hashCode());
    }
}
