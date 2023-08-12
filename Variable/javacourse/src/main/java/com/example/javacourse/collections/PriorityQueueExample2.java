package com.example.javacourse.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(6);
        pq.add(5);
        pq.add(2);

        System.out.println(pq); // does not guarantee the priority order

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
