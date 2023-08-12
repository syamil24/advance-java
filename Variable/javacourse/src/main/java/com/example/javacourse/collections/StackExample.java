package com.example.javacourse.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // stack principle is LIFO - Last In First Out
        stack.add(1);
        stack.add(2);
        stack.add(3);

        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek()); // peek display top value
        System.out.println(stack);
        System.out.println(stack.pop()); // pop gives top element and also remove it from the stack
        System.out.println(stack);
        System.out.println(stack.lastElement());
        System.out.println(stack.firstElement());
    }

}
