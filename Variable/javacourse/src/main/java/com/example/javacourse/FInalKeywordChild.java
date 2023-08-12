package com.example.javacourse;

public class FInalKeywordChild extends FinalKeywordParent {

    /*
     * public void display() {
     * System.out.println("display from child class");
     * }
     */
    // When the parent already declared final in their function, child cannot
    // override their own function

    public static void main(String[] args) {
        FInalKeywordChild fChild = new FInalKeywordChild();
        fChild.display();

    }
}
