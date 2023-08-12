package com.example.javacourse;

public class LoopExample {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {

        }

        // for( variable : sourcearray)
        for (int value : a) { // only for ascending array
            System.out.println(value);
        }

        int j = 0;

        while (j < a.length) {
            System.out.println(a[j++]);
        }
        // ------------------------Jump Statements(break the loops)
        for (int i = 0; i < a.length; i++) {
            System.out.println("This is i" + i);
            if (i == 3)
                break; // stop looping

        }

        System.out.println("// ------------------------continue Statement");
        String[] books = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (int i = 0; i < books.length; i++) {
            if (books[i] == "Saturday" || books[i] == "Sunday")
                continue; // skip current iteration

            System.out.println("Welcome to " + books[i]);
        }

        System.out.println("// ------------------------Return Statement");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == "Saturday" || books[i] == "Sunday") {
                // System.out.println("Welcome to " + books[i]);
                return; // return to the function (means it will break the function already)
            }

            System.out.println("Welcome to " + books[i]);
        }
    }

}
