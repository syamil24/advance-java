package com.example.javacourse.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExamples {

    public static void main(String[] args) {

        // LinkedList list = new LinkedList<>();
        ArrayList list = new ArrayList<>(26);// giving inital size of 26

        // list.add(1);
        // list.add(2);
        // list.add(3);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Iterator itr = list.iterator();

        // if the value present at the 0 index the it will return true
        /*
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * }
         */

        ArrayList list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        list.addAll(list2);

        System.out.println("List 1 is " + list);

        list2.clear();
        System.out.println("list 2 is " + list2);

        // System.out.println(list);

        ArrayList list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);

        ArrayList list4 = new ArrayList<>();
        list4.add(11);
        list4.add(12);
        list4.add(13);
        list4.add(14);

        System.out.println("list 3 is " + list3);
        System.out.println("list 4 is " + list4);

        System.out.println(list3.contains(12));
        System.out.println(list3.contains(20));
        System.out.println(list3.containsAll(list4));
        System.out.println(list4.containsAll(list3));

        ArrayList list5 = new ArrayList<>();
        System.out.println(list5.isEmpty());

        list3.remove(2); // it takes the index, not data
        list3.remove(Integer.valueOf(15)); // this will remove from value, not index
        System.out.println("list3 is " + list3);

        list4.removeAll(list3);
        System.out.println(list4);

        /////////////// Retain All----------------------------------------

        ArrayList list6 = new ArrayList<>();
        list6.add(11);
        list6.add(12);
        list6.add(13);

        ArrayList list7 = new ArrayList<>();
        list7.add(11);
        list7.add(12);
        list7.add(13);
        list7.add(14);

        System.out.println(list7);
        System.out.println(list7.size());
        list7.retainAll(list6);
        System.out.println(list7);
        System.out.println(list7.size());
        // convert to array
        list7.toArray();
        System.out.println(list7);

    }
}
