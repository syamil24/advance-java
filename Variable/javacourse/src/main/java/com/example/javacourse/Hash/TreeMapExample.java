package com.example.javacourse.Hash;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(1, "A");
        map.put(4, "B");
        map.put(3, "C");

        System.out.println(map);

        System.out.println(map.ceilingEntry(0));
        System.out.println(map.ceilingKey(0)); // only return key
        System.out.println("Floor Entry " + map.floorEntry(4));
        System.out.println("Floor Key " + map.floorKey(4));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("B"));

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println(map.descendingKeySet());

        Set<Integer> reverseKeys = map.descendingKeySet();

        Map reverseMap = map.descendingMap(); // it is optional to inser <> while declaring it
        System.out.println(reverseMap);

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println("-------Before Polling" + map);
        map.pollFirstEntry();
        System.out.println("-------After Polling" + map);
        map.pollLastEntry();
        System.out.println("-------After Polling" + map);

        System.out.println("--------------------------------");
        map.put(1, "A");
        map.put(2, "C");
        map.put(4, "D");

        System.out.println(map);
        System.out.println("Head Map" + map.headMap(2)); // give less than the key given
        System.out.println("Tail Map" + map.tailMap(2)); // follow the key
        System.out.println("Sub Map" + map.subMap(2, 5)); // range value to display key(toKey param will not display the
                                                          // key, but last previous before it)

    }
}
