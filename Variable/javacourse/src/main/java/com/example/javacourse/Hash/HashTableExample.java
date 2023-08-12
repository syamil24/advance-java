package com.example.javacourse.Hash;

import java.util.Hashtable;
import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {

        Hashtable table = new Hashtable<>();
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        table.put(1, "A");
        table.put(1, "B");
        table.put(2, "B");
        // table.put(null, "C");

        map.put(1, "A");
        map.put(1, "B");
        map.put(null, "C");

        System.out.println("table" + table);
        System.out.println("Map " + map);

    }

}
