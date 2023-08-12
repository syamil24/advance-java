package com.example.javacourse;

public class ExceptionExample4 {

    public void vote(int age) {
        if (age < 18)
            throw new CustomException("Age is below the limit provided");
        System.out.println("verify ID and documents");
        System.out.println("then present candidate list");
        System.out.println("then do the voting");
    }

    public static void main(String[] args) {

        ExceptionExample4 e4 = new ExceptionExample4();
        e4.vote(17);
    }
}
