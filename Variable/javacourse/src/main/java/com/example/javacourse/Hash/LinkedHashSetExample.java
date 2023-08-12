package com.example.javacourse.Hash;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("A");
        set.add("B");
        set.add("B"); // will not store the same values
        System.out.println(set);

        set.add(null);
        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
