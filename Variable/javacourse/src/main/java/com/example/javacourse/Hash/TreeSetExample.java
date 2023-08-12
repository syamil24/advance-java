package com.example.javacourse.Hash;

import java.util.TreeSet;

import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(1);
        set.add(0);
        set.add(5);
        set.add(4);
        set.add(1);

        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.last());
        System.out.println(set.first());
        System.out.println(set.pollFirst()); // display and remove the top elemetn
        System.out.println(set);
        System.out.println(set.higher(4)); // display value higher than 4
        System.out.println(set.lower(4)); // display value lower than 4
        System.out.println(set.ceiling(4)); // display value equal or higher than 4
        System.out.println(set.floor(3)); // display value equal or lower than 4

        System.out.println(set.descendingSet());

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("-------------------------------------");

        Iterator<Integer> itr1 = set.descendingIterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }

}
