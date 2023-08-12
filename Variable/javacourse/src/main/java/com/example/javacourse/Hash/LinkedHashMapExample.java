package com.example.javacourse.Hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map);

        map.put(2, "C"); // replace the value only because key 2 already there

        System.out.println(map);
        map.putIfAbsent(2, "D");
        map.putIfAbsent(3, "C");

        System.out.println(map);

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("C"));

        String value1 = map.get(3);
        System.out.println(value1);

        System.out.println(map.isEmpty());
        // System.out.println(map.keySet());

        Set<Integer> keys = map.keySet();// key can be duplicate, hence it can be stored in set
        System.out.println(keys);

        Collection<String> values = map.values(); // Collection is list...hence it can contains duplicate
        System.out.println(values);

        for (String value : values) {
            System.out.println(value);
        }

        map.remove(3);
        System.out.println(map);

        map.remove(2, "B"); // key 2 will not be removed since no value B there

        System.out.println("-----------------------------------");

        map.put(2, "C");
        map.put(3, "C");

        System.out.println(map);

        map.replace(2, "B");
        map.replace(3, "C", "E");

        System.out.println(map);

        Set<Entry<Integer, String>> entrySet = map.entrySet(); // a set of entry objects

        System.out.println(entrySet);

        for (Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
