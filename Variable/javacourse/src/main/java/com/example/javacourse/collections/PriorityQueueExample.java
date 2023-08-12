package com.example.javacourse.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(1);
        pq.add(9);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);

        System.out.println(pq);

        for (Integer value : pq) {
            System.out.println(value);
        }

        // pq.add(null); // null cannot be added inside queue

        pq.remove();
        System.out.println("After remove " + pq);
        pq.poll();
        System.out.println("After poll " + pq);

        System.out.println(pq.peek()); // print top element

        pq.offer(10);
        System.out.println("After offer " + pq);
    }
}
