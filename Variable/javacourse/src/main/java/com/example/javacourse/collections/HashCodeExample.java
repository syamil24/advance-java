package com.example.javacourse.collections;

public class HashCodeExample {

    int id;
    String name;

    public static void main(String[] args) {
        HashCodeExample hashCode1 = new HashCodeExample();

        hashCode1.name = "Test";

        HashCodeExample hashCode2 = new HashCodeExample();

        hashCode1.name = "Test";

        HashCodeExample hashCode3 = new HashCodeExample();

        hashCode1.name = "Test";

        System.out.println(hashCode1.hashCode());
        System.out.println(hashCode2.hashCode());
        System.out.println(hashCode3.hashCode());

        int hashTest = Integer.hashCode(185);
        System.out.println(hashTest);
    }

}
