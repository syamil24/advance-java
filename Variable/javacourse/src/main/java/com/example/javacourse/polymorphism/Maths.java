package com.example.javacourse.polymorphism;

public class Maths {

    // Method overloading
    public int sum(int i, int j) {
        int result = i + j;
        return result;
    }

    /*
     * This is wrong because same type of parameter
     * public double sum(int a, int b){
     * return a + b;
     * }
     */

    public int sum(int i, int j, int k) {
        int result = i + j + k;
        return result;
    }

    public double sum(double d1, double d2) {
        return d1 + d2;
    }

    public long minus(int l2, int l1) {
        System.out.println("Integer Parameter");
        return l1 - l2;
    }

    public long minus(long l2, long l1) {
        System.out.println("Long Parameter");
        return l1 - l2;
    }

    public static void main(String[] args) {
        Maths m = new Maths();
        System.out.println(m.sum(3, 5));
        System.out.println(m.sum(6, 7, 9));
        System.out.println(m.minus(11, 10));
        System.out.println(m.minus(1844674, 10));

        main(args, 1);

    }

    // This is allowed
    public static void main(String[] args, int i) {

    }

}
