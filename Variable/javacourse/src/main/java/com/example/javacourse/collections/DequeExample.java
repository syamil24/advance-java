package com.example.javacourse.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.add(1); // add at the last
        q.add(3);
        q.add(2);
        q.add(5);
        q.add(4);

        System.out.println(q);
        q.addFirst(0);
        System.out.println(q);
        q.addLast(6);
        System.out.println(q);
        q.push(20); // push also will add element at the first
        System.out.println(q);
        q.offer(25);// add at the last
        System.out.println(q);
        q.offerFirst(9);
        System.out.println(q);
        q.offerLast(12);
        System.out.println(q);

        q.remove(); // remove first element
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        q.removeLast(); // remove last element
        System.out.println(q);
        System.out.println(q.peek()); // view top element
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());

        q.pollLast();
        System.out.println(q);

        q.pop(); // prints and remove top element
        System.out.println(q);

        q.poll(); // prints and remove top element
        System.out.println(q);

        System.out.println(q.size());
        q.clear(); // remove whole queue
        System.out.println("after clear all queue" + q.size());
    }
}
