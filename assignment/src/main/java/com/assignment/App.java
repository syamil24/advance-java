package com.assignment;

/**
 * Hello world!
 *
 * @author madlim
 */
public class App {

    int age; // instance variable
    static String name; // static variable

    // If no static declared before void , tben this function need to be wrap inside
    // an object
    public static void sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result); // this is local variable
    }

    public static void main(String[] args) {
        sum(10, 12); // this function can be called directly because it has static

        name = "Syamil";
        System.out.println(name); // name variable can be called without declaring any App object
    }
}
