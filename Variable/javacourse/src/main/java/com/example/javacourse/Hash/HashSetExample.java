package com.example.javacourse.Hash;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("A");
        set.add("B");

        System.out.println(set);

        set.add(null);

        System.out.println(set);
    }
}
