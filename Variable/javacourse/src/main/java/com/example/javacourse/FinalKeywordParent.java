package com.example.javacourse;

public class FinalKeywordParent {

    final int AGE = 30; // declaring final use with CAPITAL LETTERS

    public final void display() {
        System.out.println(AGE);
    }

    public static void main(String[] args) {

        // AGE = 50; //cannot assign new value bacause variable is already final
        FinalKeywordParent finalKeyword = new FinalKeywordParent();

    }
}
