package com.example.javacourse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionExample3 {

    public void writeToTextFile(String text) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("test1.txt");
        writer.write(text);
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionExample3 e = new ExceptionExample3();
        e.writeToTextFile("Hi");
    }
}
